package com.example.task1.foo;

import java.util.Optional;


interface FooRepository {

    void save(Foo foo);

    Optional<Foo> findById(FooId fooId);
}
