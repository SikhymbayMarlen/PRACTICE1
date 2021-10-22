package com.example.Sportsmans.database;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Sportsmansdb {
    private String firstName;
    private String lastName;
    private String  NumberOfTelephone;
    private String KindOfSport;
    private String Rank;
    private int WorkExperience;

    public Sportsmansdb() {
    }

    public static SportsmansdbBuilder sportsmansdbBuilder() {return new Sportsmansdb().new SportsmansdbBuilder(); }

    public class SportsmansdbBuilder {
        private SportsmansdbBuilder() {
        }

        public SportsmansdbBuilder fname(String fname) {
            Sportsmansdb.this.firstName = fname;
            return this;
        }

        public SportsmansdbBuilder lname(String lname) {
            Sportsmansdb.this.lastName = lname;
            return this;
        }

        public SportsmansdbBuilder Mobile(String Mobile) {
            Sportsmansdb.this.NumberOfTelephone = Mobile;
            return this;
        }

        public SportsmansdbBuilder Kinds(String  Kinds) {
            Sportsmansdb.this.KindOfSport = Kinds;
            return this;
        }

        public SportsmansdbBuilder RanksOfSp(String RanksOfSp) {
            Sportsmansdb.this.Rank = RanksOfSp;
            return this;
        }

        public SportsmansdbBuilder Experience(int Experience) {
            Sportsmansdb.this.WorkExperience = Experience;
            return this;
        }

        public Sportsmansdb build() {
            return Sportsmansdb.this;
        }
    }

    public static List<Sportsmansdb> getSportsmans(){
        Sportsmansdb sportsman1 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Roger")
                .fname("Pole")
                .Mobile("87021271217")
                .Kinds("Box")
                .RanksOfSp("highest")
                .Experience(4)
                .build();

        Sportsmansdb sportsman2 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Ray")
                .fname("Lana")
                .Mobile("87012589658")
                .Kinds("Volleyball")
                .RanksOfSp("medium")
                .Experience(7)
                .build();

        Sportsmansdb sportsman3 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Holand")
                .fname("Conar")
                .Mobile("87071235457")
                .Kinds("Basketball")
                .RanksOfSp("low")
                .Experience(5)
                .build();

        Sportsmansdb sportsman4 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Borisov")
                .fname("Roman")
                .Mobile("87015251211")
                .Kinds("hockey")
                .RanksOfSp("medium")
                .Experience(8)
                .build();

        Sportsmansdb sportsman5 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Romanov")
                .fname("Sergey")
                .Mobile("87476332124")
                .Kinds("Tennis")
                .RanksOfSp("highest")
                .Experience(5)
                .build();

        Sportsmansdb sportsman6 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Adil")
                .fname("Bob")
                .Mobile("87773526587")
                .Kinds("Tennis")
                .RanksOfSp("medium")
                .Experience(5)
                .build();

        Sportsmansdb sportsman7 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Ken")
                .fname("Douglas")
                .Mobile("87015698524")
                .Kinds("Tennis")
                .RanksOfSp("highest")
                .Experience(9)
                .build();

        Sportsmansdb sportsman8 = Sportsmansdb.sportsmansdbBuilder()
                .lname("Caleb")
                .fname("Jasper")
                .Mobile("87024562559")
                .Kinds("Judo")
                .RanksOfSp("medium")
                .Experience(3)
                .build();


        return Arrays.asList(sportsman1, sportsman2, sportsman3, sportsman4,
                sportsman5, sportsman6, sportsman7, sportsman8);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberOfTelephone() {
        return NumberOfTelephone;
    }

    public void setNumberOfTelephone(String NumberOfTelephone) {
        this.NumberOfTelephone = NumberOfTelephone;
    }

    public String getKindOfSport() {
        return KindOfSport;
    }

    public void setKindOfSport(String KindOfSport) {
        this.KindOfSport = KindOfSport;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String city) {
        this.Rank = Rank;
    }

    public int getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(int WorkExperience) {
        WorkExperience = WorkExperience;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", NumberOfTelephone=" + NumberOfTelephone +
                ", KindOfSport=" + KindOfSport +
                ", Rank='" + Rank + '\'' +
                ", WorkExperience=" + WorkExperience +
                '}';
    }

}
