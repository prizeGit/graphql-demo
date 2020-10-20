package io.redintro.graphqldemo.adapter.in.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.redintro.graphqldemo.domain.Author;
import io.redintro.graphqldemo.domain.Book;
import io.redintro.graphqldemo.port.in.AuthorViewPort;
import org.springframework.stereotype.Component;

/**
 * This class is delegated to by the QueryResolver. It resolves
 * the Author attribute when a book with the author field is
 * resolved.
 */
@Component
public class BookResolver implements GraphQLResolver<Book> {
    private final AuthorViewPort authorViewPort;

    public BookResolver(AuthorViewPort authorViewPort) {
        this.authorViewPort = authorViewPort;
    }

    public Author getAuthor(Book book) {
        return authorViewPort.read(book.getAuthor().getId());
    }
}
