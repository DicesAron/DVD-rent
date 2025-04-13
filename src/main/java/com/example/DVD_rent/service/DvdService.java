package com.example.DVD_rent.service;

import com.example.DVD_rent.model.Dvd;
import com.example.DVD_rent.repository.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DvdService {

    private final DvdRepository dvdRepository;

    @Autowired
    public DvdService(DvdRepository dvdRepository) {
        this.dvdRepository = dvdRepository;
    }

    public List<Dvd> getAllDvds() {
        return dvdRepository.findAll();
    }

    public Dvd getDvdById(Long id) {
        return dvdRepository.findById(id).orElse(null);
    }

    public Dvd saveDvd(Dvd dvd) {
        return dvdRepository.save(dvd);
    }

    public void deleteDvd(Long id) {
        dvdRepository.deleteById(id);
    }
}
