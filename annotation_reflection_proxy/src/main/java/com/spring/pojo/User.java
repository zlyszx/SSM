package com.spring.pojo;

public class User {

    private int id;
    private int age;
    private String name;

    public static int a;
    public static final String COUNTRY = "中国";

    public User() {
        System.out.println("调用了无参构造器");
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        System.out.println("调用了有参构造器");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private void sing() {
        System.out.println("会唱");
    }

    public String sing(String name, Integer age) {
        return name + "会唱";
    }

    public void jump() {
        System.out.println("会跳");
    }

    public String rap(String name) {
        return name + "会rap";
    }

}
