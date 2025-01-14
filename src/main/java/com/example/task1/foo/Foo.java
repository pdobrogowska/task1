package com.example.task1.foo;

import java.util.Objects;

class Foo {
    private final FooId fooId;
    final String message;

    Foo(FooId fooId, String message) {
        this.fooId = fooId;
        this.message = message;
    }

    FooId getFooId() {
        return fooId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return Objects.equals(fooId, foo.fooId) && Objects.equals(message, foo.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fooId, message);
    }
}
