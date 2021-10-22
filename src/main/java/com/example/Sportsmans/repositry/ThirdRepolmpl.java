package com.example.Sportsmans.repositry;

import com.example.Sportsmans.database.Sportsmansdb;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
@Primary

public class ThirdRepolmpl  implements SportsmansRepository {

    @Override
    public List<Sportsmansdb> findAll() {
        return Sportsmansdb.getSportsmans().stream().
                filter(sportsmansdb -> sportsmansdb.getWorkExperience() == 5 )
                .collect(Collectors.toList());
    }
}