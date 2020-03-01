import email.EmailServiceDecorator;
import email.EmailServiceImpl;
import employee.Employee;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        EmailServiceImpl emailServiceImpl = new EmailServiceImpl();
        EmailServiceDecorator emailServiceDecorator = new EmailServiceDecorator();

        Employee manager = new Employee("Janusz Kowalski");

        Employee workerOne = new Employee("Piotr Kozik");
        Employee workerTwo = new Employee("Adam Nowacki");

        emailServiceImpl.send(manager, Arrays.asList(workerOne,workerTwo),"titleOne","contentOne");
        emailServiceDecorator.send(manager, Arrays.asList(workerOne,workerTwo),"titleOne","contentOne");

    }
}
