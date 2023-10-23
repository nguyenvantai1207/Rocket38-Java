package com.vti.entity;

public class Account {
    private String username;
    private String password;
    private Boolean isLogin;
    private Boolean isRegister;

    public Account(String username, String password, Boolean isLogin, Boolean isRegister) {
        this.username = username;
        this.password = password;
        this.isLogin = isLogin;
        this.isRegister = isRegister;
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

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    public Boolean getRegister() {
        return isRegister;
    }

    public void setRegister(Boolean register) {
        isRegister = register;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isLogin=" + isLogin +
                '}';
    }
}
