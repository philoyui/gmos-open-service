package cn.com.gome.cloud.gmos.open.service.event;

/**
 * 应用下线
 */
public class AppOffLineEvent {

    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
