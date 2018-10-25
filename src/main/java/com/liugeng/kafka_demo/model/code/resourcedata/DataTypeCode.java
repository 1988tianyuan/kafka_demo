package com.liugeng.kafka_demo.model.code.resourcedata;

public enum DataTypeCode {
    SECURE_DATA("SECURE_DATA");

    private String value;

    DataTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static DataTypeCode fromValue(String text) {
        for (DataTypeCode b : DataTypeCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}