package com.example.springboottemplate.entity;


public class User {
    private Integer id;
    private String name;
    private Integer roleId;
    private String mail;
    private String phone;

    public User() {
    }

    public User(Integer id, String name, Integer roleId, String mail, String phone) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
        this.mail = mail;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
