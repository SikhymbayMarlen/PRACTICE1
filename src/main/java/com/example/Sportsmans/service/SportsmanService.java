package com.example.Sportsmans.service;

import com.example.Sportsmans.database.Sportsmansdb;
import com.example.Sportsmans.repositry.SportsmansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportsmanService {
    private SportsmansRepository sportsmansRepository;

    @Autowired
    public SportsmanService(SportsmansRepository sportsmansRepository){
        this.sportsmansRepository = sportsmansRepository;
    }

    public List<Sportsmansdb> getAll(){
        return sportsmansRepository.findAll();
    }
}
