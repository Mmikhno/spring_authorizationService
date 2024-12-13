package ru.netology.authorizationService.user;

import ru.netology.authorizationService.service.Authorities;

public class User {
    private String userName;
    private String password;
    private Authorities[] authorities;

    public User() {
    }

    public User(String u, String p, Authorities[] a) {
        this.userName = u;
        this.password = p;
        this.authorities = a;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authorities[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authorities[] authorities) {
        this.authorities = authorities;
    }
}
