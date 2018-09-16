package cn.com.gome.cloud.gmos.open.service.event;

/**
 * 消息被推送的事件
 */
public class MessagePushedEvent {

    private String id;

    /**
     * 应用键值
     */
    private String appKey;

    /**
     * 请求分组名
     */
    private String groupName;

    /**
     * 主题
     */
    private String topicName;

    /**
     * 正文
     */
    private String payload;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

}
