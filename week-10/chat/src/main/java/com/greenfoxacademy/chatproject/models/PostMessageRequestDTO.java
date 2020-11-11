package com.greenfoxacademy.chatproject.models;

public class PostMessageRequestDTO {

    private Integer channelId;
    private String channelSecret;
    private String content;

    public PostMessageRequestDTO() {
    }

    public PostMessageRequestDTO(Integer channelId, String channelSecret, String content) {
        this.channelId = channelId;
        this.channelSecret = channelSecret;
        this.content = content;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelSecret() {
        return channelSecret;
    }

    public void setChannelSecret(String channelSecret) {
        this.channelSecret = channelSecret;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
