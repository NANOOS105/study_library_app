package com.group.libraryapp.domain.user;

public class User {
    private String name;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private Integer age;
    public User(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.name = name;
        this.age = age;
    }
}
