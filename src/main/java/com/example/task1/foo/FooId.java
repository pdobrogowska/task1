package com.example.task1.foo;

import java.util.Objects;
import java.util.UUID;

class FooId {

    private final Object fooId;

    FooId(UUID uuid) {
        this.fooId = uuid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FooId fooId1 = (FooId) obj;
        return Objects.equals(fooId, fooId1.fooId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fooId);
    }
}
