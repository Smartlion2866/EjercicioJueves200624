package com.example.examen.entity;


import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "libro")
public class Libro {

    private int _id;
    private String title;
    private String isbn;
    private int pageCount;
    private Date publishedDate;
    private String thumbnailUrl;
    private String longDescription;
    private String status;
    private String authors;
    private String categories;
}
