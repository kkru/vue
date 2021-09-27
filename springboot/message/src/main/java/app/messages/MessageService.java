package app.messages;
import java.text.MessageFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MessageService {

    private final static Log logger = LogFactory.getLog(SecurityChecker.class);

    private MessageRepository repository;

    @Autowired
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    @SecurityCheck
    @Transactional
    public Message save(String text) {
        Message message = repository.saveMessage(new Message(text));
        logger.debug(MessageFormat.format("New message[id={0}] saved", message.getId()));
        updateStatistics();

        return message;
    }

    private void updateStatistics() {
        throw new UnsupportedOperationException("this method is not implemented yet");
    }

}
