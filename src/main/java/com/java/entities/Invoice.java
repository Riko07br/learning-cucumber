package com.java.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Invoice {
    private Movie movie;
    private Float rentPrice;
    private LocalDate returnDate;

    public Invoice(Movie movie, Float rentPrice, LocalDate returnDate) {
        this.movie = movie;
        this.rentPrice = rentPrice;
        this.returnDate = returnDate;
    }
}
