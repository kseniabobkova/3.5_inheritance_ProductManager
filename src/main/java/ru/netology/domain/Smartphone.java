package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String producer;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone shirt = (Smartphone) o;
        return Objects.equals(producer, shirt.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer);
    }

    @Override
    public String toString() {
        return "Book{" +
                "produser='" + producer + '\'' +
                '}';
    }
}
