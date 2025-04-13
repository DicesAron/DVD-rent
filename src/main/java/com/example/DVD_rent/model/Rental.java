package com.example.DVD_rent.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long dvdId;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    public Rental() {}

    public Rental(Long customerId, Long dvdId, LocalDate rentalDate, LocalDate returnDate) {
        this.customerId = customerId;
        this.dvdId = dvdId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getDvdId() {
        return dvdId;
    }

    public void setDvdId(Long dvdId) {
        this.dvdId = dvdId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}

