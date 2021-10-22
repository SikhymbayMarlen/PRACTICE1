package com.example.Sportsmans.repositry;

import com.example.Sportsmans.database.Sportsmansdb;

import java.util.List;

public interface SportsmansRepository {
    List<Sportsmansdb> findAll();
}
