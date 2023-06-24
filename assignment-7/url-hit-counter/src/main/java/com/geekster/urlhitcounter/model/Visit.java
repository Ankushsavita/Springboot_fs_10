package com.geekster.urlhitcounter.model;

public class Visit {
    private Integer count;
    private String username;

    public Visit(String username, Integer count) {
        this.count = count;
        this.username = username;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UrlHit{" +
                "count=" + count +
                ", username='" + username + '\'' +
                '}';
    }
}
