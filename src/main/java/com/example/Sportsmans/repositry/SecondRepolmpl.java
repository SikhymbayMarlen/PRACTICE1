package com.example.Sportsmans.repositry;

import com.example.Sportsmans.database.Sportsmansdb;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository


public class SecondRepolmpl implements SportsmansRepository {
    @Override
    public List<Sportsmansdb> findAll(){
        return Sportsmansdb.getSportsmans().stream().
                filter(sportsmansdb -> sportsmansdb.getRank().equals("highest"))
                .collect(Collectors.toList());
    }
}
