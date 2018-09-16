package cn.com.gome.cloud.gmos.open.service.dao;

import cn.com.gome.cloud.gmos.open.service.domain.MessageQueue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageQueueDao extends JpaRepository<MessageQueue,String> {

    MessageQueue findBySessionId(String sessionId);

}
