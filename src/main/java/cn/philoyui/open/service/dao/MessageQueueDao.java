package cn.philoyui.open.service.dao;

import cn.philoyui.open.service.domain.MessageQueue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageQueueDao extends JpaRepository<MessageQueue,String> {

    MessageQueue findBySessionId(String sessionId);

}
