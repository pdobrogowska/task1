package com.example.task1.foo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class FooController {

    private final TimeService timeService;

    @PostMapping("/foo1")
    public ResponseEntity<Void> foo2() {
        //TODO should:
        // - transform: now -> "dd.MM.yyyy"
        // - save the result to the database
        // - notify external system
        timeService.processTransformation(new DateFormatTransformation());
        return ResponseEntity.accepted().build();
    }


    @PostMapping("/foo2")
    public ResponseEntity<Void> foo1() {
        //TODO should:
        // - transform: now -> "Before/After noon"
        // - save the result to the database
        // - notify external system
        timeService.processTransformation(new BeforeAfterNoonTransformation());
        return ResponseEntity.accepted().build();
    }

}
