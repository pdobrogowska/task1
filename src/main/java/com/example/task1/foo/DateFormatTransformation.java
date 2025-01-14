package com.example.task1.foo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatTransformation implements TimeTransformation{
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public String transform(LocalDateTime dateTime) {
        return dateTime.format(FORMATTER);
    }
}
