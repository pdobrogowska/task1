package com.example.task1.foo;

import com.example.task1.adapter.ExternalSystemAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
class FooMockConfiguration {

    @Bean
    ExternalSystemAdapter getExternalSystemAdapter() {
        return message -> {
            //do nothing - let's assume that it's an external system call
        };
    }

    @Bean
    FooRepository getFooRepository() {
        return new FooRepository() {
            @Override
            public void save(Foo foo) {
                //do nothing - let's assume it's a JPA repository
            }

            @Override
            public Optional<Foo> findById(FooId fooId) {
                // return nothing - let's assume the result comes from a JPA repository
                return Optional.empty();
            }
        };
    }

}
