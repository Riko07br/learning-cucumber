package com.java.services;

import com.java.entities.Invoice;
import com.java.entities.Movie;

import java.time.LocalDate;

public class RentService {
    public Invoice rent(Movie movie, Float price) {
        if (movie.getStock() <= 0)
            throw new RuntimeException("Movie has no stock");

        movie.setStock(movie.getStock() - 1);
        LocalDate returnDate = LocalDate.now().plusDays(1);
        return new Invoice(movie, price, returnDate);
    }
}
