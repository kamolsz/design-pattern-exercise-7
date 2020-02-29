import email.EmailServiceImpl;
import employee.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmailServiceImpl emailServiceImpl = new EmailServiceImpl();

        Employee manager = new Employee("Janusz Kowalski");

        Employee workerOne = new Employee("Piotr Kozik");
        Employee workerTwo = new Employee("Adam Nowacki");

        emailServiceImpl.send(manager, Arrays.asList(workerOne,workerTwo),"titleOne","contentOne");

    }
}
