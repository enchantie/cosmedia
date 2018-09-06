package com.pixiecosmetics.model;

public enum PeriodAfterOpening {
    PAO_3M("3M"),
    PAO_6M("6M"),
    PAO_9M("9M"),
    PAO_12M("12M"),
    PAO_24M("24M");

    private String value;

    public String getValue() {
        return value;
    }

    PeriodAfterOpening(String value) {
        this.value = value;
    }
}
