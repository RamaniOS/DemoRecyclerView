package com.example.demo;

public class Manager {
    private static final Manager ourInstance = new Manager();

    public static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {
    }
}
