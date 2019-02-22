import email.EmailService;
import employee.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();

        Employee manager = new Employee("Janusz Kowalski");

        Employee workerOne = new Employee("Piotr Kozik");
        Employee workerTwo = new Employee("Adam Nowacki");

        emailService.send(manager, Arrays.asList(workerOne,workerTwo),"titleOne","contentOne");



    }
}
