package com.example.BookstoreAPI.dto;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String isbn;
}

