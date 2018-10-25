package com.liugeng.kafka_demo.model.code.resourcedata;

public enum EventTypeCode {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    DELETE("DELETE");

    private String value;

    EventTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static EventTypeCode fromValue(String text) {
        for (EventTypeCode b : EventTypeCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}