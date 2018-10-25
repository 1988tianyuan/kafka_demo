package com.liugeng.kafka_demo.model.code.resourcedata;

public enum ResultTypeCode {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private String value;

    ResultTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static ResultTypeCode fromValue(String text) {
        for (ResultTypeCode b : ResultTypeCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}