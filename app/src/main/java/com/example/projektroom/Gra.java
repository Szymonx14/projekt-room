package com.example.projektroom;


import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public int minLiczbaOsob, maksLiczbaOsob, kategoriaWiekowa;
    public String kategoria;

    public Gra(String nazwa, int minLiczbaOsob, int maksLiczbaOsob, int kategoriaWiekowa, String kategoria) {
        this.nazwa = nazwa;
        this.minLiczbaOsob = minLiczbaOsob;
        this.maksLiczbaOsob = maksLiczbaOsob;
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.kategoria = kategoria;
    }
}
