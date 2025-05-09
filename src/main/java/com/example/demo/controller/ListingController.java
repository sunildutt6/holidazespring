package com.example.demo.controller;

import com.example.demo.model.Listing;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    @GetMapping
    public List<Listing> getAllListings() {
        return Arrays.asList(
            new Listing(1L, "Fjord Hotel", "Bergen", "Scenic view by the fjord", "https://source.unsplash.com/400x300/?fjord,hotel", 1200),
            new Listing(2L, "Mountain Lodge", "Geilo", "Peaceful mountain lodge", "https://source.unsplash.com/400x300/?mountain,lodge", 950),
            new Listing(3L, "City Center Inn", "Oslo", "Perfect for business travelers", "https://source.unsplash.com/400x300/?city,hotel", 1500)
        );
    }
}
