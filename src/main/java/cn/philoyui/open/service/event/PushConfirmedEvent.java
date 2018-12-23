package cn.philoyui.open.service.event;

/**
 * 消息推送被确认
 */
public class PushConfirmedEvent {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
