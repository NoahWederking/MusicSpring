package com.example.springmusic.service;

import com.example.springmusic.model.Musician;
import com.example.springmusic.repository.MusicianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicianService {
    @Autowired
    MusicianRepo musicianRepo;

    public List<Musician> fetchAll(){
        return musicianRepo.fetchAll();
    }
    public void addMusician(Musician musician){
        musicianRepo.addMusician(musician);
    }

    public Musician findMusicianById(int id){
        return findMusicianById(id);
    }


}
