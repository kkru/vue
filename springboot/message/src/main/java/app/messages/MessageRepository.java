package app.messages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    private final static Log logger = LogFactory.getLog(MessageRepository.class);

    @Autowired
    private SessionFactory sessionFactory;

    public MessageRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Message saveMessage(Message message) {
        // 데이터베이스에 메시지를 저장한다.
        Session session = sessionFactory.getCurrentSession();
        logger.debug(session);
        session.save(message);
        return message;

    }

}
