package cn.philoyui.open.service.event;

/**
 * 应用上线
 */
public class AppOnlineEvent {

    /**
     * 应用键值
     */
    private String appKey;


    /**
     * 分组
     */
    private String group;

    /**
     * 请求IP
     */
    private String clientIp;

    /**
     * 本地IP
     */
    private String gatewayIp;

    /**
     * 会话ID
     */
    private String sessionId;

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
