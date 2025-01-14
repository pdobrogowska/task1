package com.example.task1.adapter;

public interface ExternalSystemAdapter {
    void notify(NotificationDto notification);

    record NotificationDto(String message) {
    }
}
