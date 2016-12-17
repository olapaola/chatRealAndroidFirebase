package com.paolagarcia.navidadconfirebase.chatreal;

/**
 * Created by paolagarciagarcia on 15/12/16.
 */

public class BotMessage {

    private String key;
    private String value;


    public BotMessage() {
    }

    public BotMessage(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
