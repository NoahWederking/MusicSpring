package com.example.springmusic.repository;

import com.example.springmusic.model.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicianRepo {
    @Autowired
    JdbcTemplate template;

    public List<Musician> fetchAll(){
        String sql = "SELECT * FROM musician";
        RowMapper<Musician> rowMapper = new BeanPropertyRowMapper<>(Musician.class);
        return template.query(sql,rowMapper);
    }

    public void addMusician(Musician musician){
        String sql = "INSERT INTO musician (id, name, best_album, record_label) VALUES (?, ?, ?, ?)";
        template.update(sql, musician.getId(), musician.getName(), musician.getBest_album(), musician.getRecord_label());
    }
}
