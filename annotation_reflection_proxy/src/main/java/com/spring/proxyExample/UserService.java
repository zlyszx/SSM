package com.spring.proxyExample;

public interface UserService {

    void login(String username,String password) throws InterruptedException;

    void deleteUser() throws InterruptedException;

    String[] selectUsers() throws InterruptedException;

}
