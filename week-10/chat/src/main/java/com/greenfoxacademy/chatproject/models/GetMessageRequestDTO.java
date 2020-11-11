package com.greenfoxacademy.chatproject.models;

public class GetMessageRequestDTO {

    private Integer channelId;
    private String channelSecret;
    private int count;

    public GetMessageRequestDTO() {
        this.count = 10;
    }

    public GetMessageRequestDTO(Integer channelId, String channelSecret, int count) {
        this.channelId = channelId;
        this.channelSecret = channelSecret;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
