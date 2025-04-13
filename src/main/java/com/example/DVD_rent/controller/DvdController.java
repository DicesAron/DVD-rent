package com.example.DVD_rent.controller;

import com.example.DVD_rent.model.Dvd;
import com.example.DVD_rent.service.DvdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dvds")
public class DvdController {

    private final DvdService dvdService;

    @Autowired
    public DvdController(DvdService dvdService) {
        this.dvdService = dvdService;
    }

    @GetMapping
    public List<Dvd> getAllDvds() {
        return dvdService.getAllDvds();
    }

    @GetMapping("/{id}")
    public Dvd getDvdById(@PathVariable Long id) {
        return dvdService.getDvdById(id);
    }

    @PostMapping
    public Dvd createDvd(@RequestBody Dvd dvd) {
        return dvdService.saveDvd(dvd);
    }

    @DeleteMapping("/{id}")
    public void deleteDvd(@PathVariable Long id) {
        dvdService.deleteDvd(id);
    }
}
