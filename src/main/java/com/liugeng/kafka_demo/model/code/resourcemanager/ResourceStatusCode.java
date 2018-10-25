package com.liugeng.kafka_demo.model.code.resourcemanager;

public enum ResourceStatusCode {
    CREATED("CREATED"),
    DELETED("DELETED");

    private String value;

    ResourceStatusCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static ResourceStatusCode fromValue(String text) {
        for (ResourceStatusCode b : ResourceStatusCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}



