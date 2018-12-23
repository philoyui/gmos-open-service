package cn.philoyui.open.service.eventhandler;

import cn.philoyui.open.service.domain.MessageQueue;
import cn.com.gome.cloud.gmos.open.service.event.*;
import cn.philoyui.open.service.manager.MessageQueueManager;
import cn.philoyui.open.service.event.AppOffLineEvent;
import cn.philoyui.open.service.event.AppOnlineEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageQueueEventHandler {

    @Autowired
    private MessageQueueManager messageQueueManager;

    /**
     * 应用上线
     */
    public void handleOnline(AppOnlineEvent event){

        MessageQueue messageQueue = new MessageQueue();
        messageQueue.setAppKey(event.getAppKey());
        messageQueue.setClientIp(event.getClientIp());
        messageQueue.setCreatedTime(new Date());
        messageQueue.setGatewayIp(event.getGatewayIp());
        messageQueue.setGroup(event.getGroup());
        messageQueue.setSessionId(event.getSessionId());

        messageQueueManager.insert(messageQueue);

    }


    /**
     * 应用下线
     */
    public void handleOffline(AppOffLineEvent event){

        MessageQueue messageQueue = messageQueueManager.findBySessionId(event.getSessionId());

        if(messageQueue!=null){
            messageQueueManager.delete(messageQueue);
        }

    }

}
