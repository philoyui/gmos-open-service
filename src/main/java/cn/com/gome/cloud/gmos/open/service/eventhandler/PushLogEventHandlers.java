package cn.com.gome.cloud.gmos.open.service.eventhandler;

import cn.com.gome.cloud.gmos.open.service.domain.PushLog;
import cn.com.gome.cloud.gmos.open.service.event.MessagePushedEvent;
import cn.com.gome.cloud.gmos.open.service.event.PushConfirmedEvent;
import cn.com.gome.cloud.gmos.open.service.event.PushedFailedEvent;
import cn.com.gome.cloud.gmos.open.service.manager.PushLogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PushLogEventHandlers {

    @Autowired
    public PushLogManager pushLogManager;


    /**
     *
     * 监听消息推送的事件，记录事件日志到ES
     *
     * @param event
     */
    public void handlerPushed(MessagePushedEvent event){

        PushLog pushLog = new PushLog();
        pushLog.setId(event.getId());
        pushLog.setAppKey(event.getAppKey());
        pushLog.setGroupName(event.getGroupName());
        pushLog.setPayload(event.getPayload());
        pushLog.setTopicName(event.getTopicName());

        pushLog.setStatus("Created");
        pushLog.setCreatedTime(new Date());

        pushLogManager.insert(pushLog);

    }

    /**
     *
     * 确认推送成功事件，事件日志更新最后成功
     *
     * @param event
     */
    public void handleConfirmed(PushConfirmedEvent event){
        PushLog pushLog = pushLogManager.get(event.getId());
        pushLog.setConfirmTime(new Date());
        pushLog.setStatus("Confirm");
        pushLogManager.update(pushLog);
    }

    /**
     * 推送失败，标记出错
     * @param event
     */
    public void handleFailed(PushedFailedEvent event){

        PushLog pushLog = pushLogManager.get(event.getId());
        pushLog.setStatus("Fail");
        pushLogManager.update(pushLog);

    }

}
