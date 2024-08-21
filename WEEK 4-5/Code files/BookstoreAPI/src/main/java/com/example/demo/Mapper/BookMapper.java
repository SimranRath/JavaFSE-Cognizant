package com.example.demo.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.entities.Book;
import com.example.demo.dtos.BookDTO;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "author", target = "author")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "isbn", target = "isbn")
    BookDTO bookToBookDTO(Book book);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "author", target = "author")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "isbn", target = "isbn")
    Book bookDTOToBook(BookDTO bookDTO);
}

