package com.example.Sportsmans.repositry;

import com.example.Sportsmans.database.Sportsmansdb;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SportsmansRepolmpl implements SportsmansRepository{
    @Override
    public List<Sportsmansdb> findAll(){
        return Sportsmansdb.getSportsmans();
    }
}
