package exercise5;

public class NotifierTest {
 public static void main(String[] args) {
     // Create an email notifier
     Notifier emailNotifier = new EmailNotifier();

     // Decorate with SMS notifier
     Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

     // Decorate with Slack notifier
     Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

     // Send notification
     slackNotifier.send("Hello, world!");
 }
}
