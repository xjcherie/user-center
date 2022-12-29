package com.example.usercenter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.UUID;

@Data
@AllArgsConstructor
public class User {

    private static final Random AGE_RANDOM = new Random();

    private int id;

    private String name;

    private int age;

    public static String genName() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 6);
    }

    public static int genAge() {
        return AGE_RANDOM.nextInt(100);
    }

}
