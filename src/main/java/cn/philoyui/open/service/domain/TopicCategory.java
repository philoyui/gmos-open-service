package cn.philoyui.open.service.domain;

import java.io.Serializable;

/**
 * 订阅主题分类
 */
public class   TopicCategory implements Serializable {

    private String id;

    private String name;

    private String platformId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}
