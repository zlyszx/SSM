package com.spring.proxyExample;

public class UserServiceImp implements UserService{
    @Override
    public void login(String username, String password) throws InterruptedException {
        if(username.equals("admin") && password.equals("123456")) {
            System.out.println("欢迎登录！");
        }else {
            System.out.println("密码错误！");
        }

        Thread.sleep(1000);
    }

    @Override
    public void deleteUser() throws InterruptedException {
        System.out.println("删除用户成功！");
        Thread.sleep(1000);
    }

    @Override
    public String[] selectUsers() throws InterruptedException {
        System.out.println("查询出用户");
        String[] names = {"张三","王五","李四"};
        Thread.sleep(1000);
        return names;
    }
}
