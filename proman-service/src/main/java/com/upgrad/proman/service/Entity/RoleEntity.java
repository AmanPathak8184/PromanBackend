package com.upgrad.proman.service.Entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "ROLES" , schema = "proman")
public class RoleEntity implements Serializable {

    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "UUID")
    @NotNull
    private int uuid;

    @Column(name = "NAME")
    @NotNull
    @Size(max = 50)
    private String name;

    @Column(name = "DESCRIPTION")
    @NotNull
    @Size(max = 200)
    private String description;

    @Column(name = "ACTIVE")
    @NotNull
    private boolean active;

    @Version
    @Column(name = "VERSION" , length = 19, nullable = false)
    private Long version;

    @Column(name = "CREATED_AT")
    @NotNull
    private ZonedDateTime createdAt;

    @Column(name = "CREATED_BY")
    @NotNull
    private String createdBy;

    @Column(name = "MODIFIED_AT")
    @NotNull
    private ZonedDateTime modifiedAt;

    @Column(name = "MODIFIED_BY")
    @NotNull
    private String modifiedBy;

    // Getters and Setters

    public Integer getId(){ return id;}

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ZonedDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    // Equals and Hashcode Implementation

    @Override
    public boolean equals(Object obj){
        return new EqualsBuilder().append(this, obj).isEquals();
    }

    @Override
    public  int hashCode(){
        return new HashCodeBuilder().append(this).hashCode();
    }

    @Override
    public  String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}


