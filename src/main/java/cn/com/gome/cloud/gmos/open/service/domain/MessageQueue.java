package cn.com.gome.cloud.gmos.open.service.domain;

import java.io.Serializable;
import java.util.Date;

public class MessageQueue implements Serializable {

    /**
     * 应用键值
     */
    private String appKey;

    /**
     * 分组信息
     */
    private String group;

    /**
     * 会话ID
     */
    private String sessionId;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 网关IP
     */
    private String gatewayIp;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }
}
