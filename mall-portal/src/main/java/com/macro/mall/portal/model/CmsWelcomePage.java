package com.macro.mall.portal.model;

import java.io.Serializable;

public class CmsWelcomePage implements Serializable {
    /**
     * 主键id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 欢迎页内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 欢迎页图片
     *
     * @mbggenerated
     */
    private String image;

    /**
     * 底部免责说明
     *
     * @mbggenerated
     */
    private String bottomTopic;

    /**
     * 类型 0 商家 1 客户
     *
     * @mbggenerated
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBottomTopic() {
        return bottomTopic;
    }

    public void setBottomTopic(String bottomTopic) {
        this.bottomTopic = bottomTopic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", image=").append(image);
        sb.append(", bottomTopic=").append(bottomTopic);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}