package com.example.BookstoreAPI.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Book {
    private Long id;
    @NotNull
    @Size(min =2, max=50)
    private String title;
    @NotNull
    @Size(min =2, max=50)
    private String author;
    @Min(0)
    private Double price;
    private String isbn;
}
