package com.northcoders.recordshop.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Album {
    private long id;
    private String title;
    private String genre;
    private String artist;
    private int releaseYear;
    private long stock;
    private double price;
}
