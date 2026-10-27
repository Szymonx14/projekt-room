package com.example.projektroom;

import androidx.room3.Dao;
import androidx.room3.Delete;
import androidx.room3.Insert;
import androidx.room3.Query;
import androidx.room3.Update;

import java.util.List;

@Dao
public interface GryDAO {
    @Insert
    public void wstawGreDoBazy(Gra gra);

    @Insert
    public void wstawGryDoBazy(Gra ... gry);

    @Delete
    public void usunZBazy(Gra gra);

    @Update
    public void aktualizujGre(Gra gra);

    @Query("SELECT * from gry")
    public List<Gra> zwrocWszystkieGry();

    @Query("SELECT nazwa from gry where minLiczbaOsob = :ile")
    public List<String> zwrocNazwyGierDlaLiczbyOsob(int ile);
}
