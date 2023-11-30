package seminar4.message;

public class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String recipient) {
        messageService.sendMessage(message, recipient);
        messageService.sendMessageTo(message, recipient);
        messageService.sendMessage(message, recipient);
        messageService.sendMessage(message, recipient);
    }
}
