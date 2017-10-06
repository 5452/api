package com.cissdata.entity;

import com.alibaba.fastjson.JSON;
import com.cissdata.base.BaseEntity;

import java.util.Date;

public class User extends BaseEntity {

    private String username;

    private String password;

    private Boolean enabled;

    public User(){}

    public User(String username, String password, Boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public User(Long id, Date createdAt, Date updatedAt, String username, String password, Boolean enabled) {
        super(id, createdAt, updatedAt);
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        return getUsername().equals(user.getUsername());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getUsername().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
