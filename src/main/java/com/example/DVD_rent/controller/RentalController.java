package com.example.DVD_rent.controller;

import com.example.DVD_rent.model.Rental;
import com.example.DVD_rent.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<Rental> getAll() {
        return rentalService.getAllRentals();
    }

    @GetMapping("/{id}")
    public Rental getById(@PathVariable Long id) {
        return rentalService.getRentalById(id);
    }

    @PostMapping
    public Rental create(@RequestBody Rental rental) {
        return rentalService.saveRental(rental);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }
}
