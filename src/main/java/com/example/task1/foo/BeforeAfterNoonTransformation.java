package com.example.task1.foo;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BeforeAfterNoonTransformation implements TimeTransformation {

    @Override
    public String transform(LocalDateTime dateTime) {
        return dateTime.toLocalTime().isBefore(LocalTime.NOON) ? "Before noon" : "After noon";
    }
}
