package io.redintro.graphqldemo.port.out;

import io.redintro.graphqldemo.domain.Author;

import java.util.List;
import java.util.UUID;

public interface AuthorStorePort {
    List<Author> findAll();
    Author create(Author author);
    Author read(UUID id);
    Author update(Author author);
    boolean delete(UUID id);
    long count();
}
