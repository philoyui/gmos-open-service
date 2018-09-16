package cn.com.gome.cloud.gmos.open.service.manager;

import cn.com.gome.cloud.gmos.open.service.dao.MessageQueueDao;
import cn.com.gome.cloud.gmos.open.service.domain.MessageQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueManager {

    @Autowired
    private MessageQueueDao messageQueueDao;

    public void insert(MessageQueue messageQueue) {
        messageQueueDao.save(messageQueue);
    }

    public MessageQueue findBySessionId(String sessionId) {
        return messageQueueDao.findBySessionId(sessionId);
    }

    public void delete(MessageQueue messageQueue) {
        messageQueueDao.delete(messageQueue);
    }

    /**
     * 通过消息的topic，查询订阅的所有App + group 信息
     */


    /**
     * 查看所有的在线应用，远程IP，SessionId，队列机器所在IP
     */

}
