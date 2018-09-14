package cn.com.gome.cloud.gmos.open.service.domain;

import java.io.Serializable;

/**
 * 消息主题
 */
public class MessageTopic implements Serializable {

    private String id;

    private String name;

    private String description;

    private String categoryId;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
