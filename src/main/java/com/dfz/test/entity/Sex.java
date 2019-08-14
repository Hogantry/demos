package com.dfz.test.entity;

public enum Sex {

    FEMALE(1, "female"),
    MALE(2, "male");

    private int code;
    private String sex;

    Sex(int code, String sex) {
        this.code = code;
        this.sex = sex;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static Sex getSex(int code) {
        if (code == 1) {
            return FEMALE;
        } else if (code == 2) {
            return MALE;
        }
        return null;
    }
}
