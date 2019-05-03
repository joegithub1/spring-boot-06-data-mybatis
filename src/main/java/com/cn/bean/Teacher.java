package com.cn.bean;

public class Teacher {
    private Long tId;
    private Long tAge;
    private String tName;

    public Teacher() {
    }

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public Long gettAge() {
        return tAge;
    }

    public void settAge(Long tAge) {
        this.tAge = tAge;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
