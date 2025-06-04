package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        String response = OkHttpUtils.get("https://baidu.com");
        System.out.println(response);
    }
}
