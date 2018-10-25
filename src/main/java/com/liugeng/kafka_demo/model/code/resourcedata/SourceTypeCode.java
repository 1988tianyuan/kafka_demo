package com.liugeng.kafka_demo.model.code.resourcedata;

public enum SourceTypeCode {
    CONSOLE("CONSOLE"),
    API("API");

    private String value;

    SourceTypeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static SourceTypeCode fromValue(String text) {
        for (SourceTypeCode b : SourceTypeCode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}



