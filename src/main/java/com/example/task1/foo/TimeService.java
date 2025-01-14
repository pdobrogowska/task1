package com.example.task1.foo;

import com.example.task1.adapter.ExternalSystemAdapter;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TimeService implements TimeServiceImpl {

    private final ExternalSystemAdapter externalSystemAdapter;
    private FooRepository fooRepository;

    @Override
    public void processTransformation(TimeTransformation transformation) {
        LocalDateTime now = LocalDateTime.now();
        String transformed = transformation.transform(now);
        saveAndSendFoo(transformed);
    }

    private void saveAndSendFoo(String message) {
        Foo foo = new Foo(new FooId(UUID.randomUUID()), message);
        fooRepository.save(foo);
        externalSystemAdapter.notify(new ExternalSystemAdapter.NotificationDto(message));
    }
}
