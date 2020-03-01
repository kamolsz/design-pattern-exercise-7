package email;

import employee.Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmailServiceDecorator implements EmailService {

    String message;
    File file = new File("emailLog.txt");


    @Override
    public boolean send(Employee from, List<Employee> recipient, String title, String content) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        message = from.toString() + " " + recipient + " " + title + content;
        FileWriter writer = new FileWriter(file);
        writer.write(message);
        writer.close();
        return false;
    }
}
