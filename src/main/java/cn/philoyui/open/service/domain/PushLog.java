package cn.philoyui.open.service.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Document(indexName = "push_log",type = "push_log",shards = 4,replicas = 2)
public class PushLog implements Serializable {

    @Id
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

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 确认时间
     */
    private Date confirmTime;

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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }
}
