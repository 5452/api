package com.cissdata.base;

import com.alibaba.fastjson.JSON;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    private Long id;

    private Date createdAt;

    private Date updatedAt;

    public BaseEntity() {
    }

    public BaseEntity(Long id, Date createdAt, Date updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
