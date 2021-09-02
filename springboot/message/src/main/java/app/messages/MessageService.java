package app.messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private MessageRepository repository;

    @Autowired
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    @SecurityCheck
    public Message save(String text) {
        return repository.saveMessage(new Message(text));
    }

}
