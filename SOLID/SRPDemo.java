class UserService {

    void registerUser() {
        System.out.println("User registered");
    }
}
class EmailService {

    void sendEmail() {
        System.out.println("Email sent");
    }
}
class ReportService {

    void generateReport() {
        System.out.println("Report generated");
    }
}



public class SRPDemo {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.registerUser();

        EmailService emailService = new EmailService();
        emailService.sendEmail();

        ReportService reportService = new ReportService();
        reportService.generateReport();
    }
}