package com.dzhenetl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private static Logger instance;

    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("[" + time.format(formatter) + " " + num++ + "] " + msg);
    }
}
