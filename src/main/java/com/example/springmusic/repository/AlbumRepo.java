package com.example.springmusic.repository;

import com.example.springmusic.model.Album;
import com.example.springmusic.model.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumRepo {

    @Autowired
    JdbcTemplate template;


    public List<Album> fetchAll(){
        String sql = "SELECT * FROM track";
        RowMapper<Album> rowMapper = new BeanPropertyRowMapper<>(Album.class);
        return template.query(sql,rowMapper);
    }


    public void addAlbum(Album album){
        String sql = "INSERT INTO track (id, track_1, track_2, track_3, track_4) VALUES (?, ?, ?, ?, ?)";
        template.update(sql, album.getId(), album.getTrack_1(), album.getTrack_2(), album.getTrack_3(),
                album.getTrack_4());
    }
}
