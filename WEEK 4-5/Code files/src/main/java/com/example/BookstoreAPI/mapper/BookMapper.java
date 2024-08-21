package com.example.BookstoreAPI.mapper;

import com.example.BookstoreAPI.dto.BookDTO;
import com.example.BookstoreAPI.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface BookMapper {
    BookDTO toBookDTO(Book book);
    Book toBook(BookDTO bookDTO);
}
