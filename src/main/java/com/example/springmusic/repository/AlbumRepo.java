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

    public Album findAlbumById(int id){
        String sql =("SELECT * FROM track WHERE id = ?");
        RowMapper<Album> rowMapper = new BeanPropertyRowMapper<>(Album.class);
        Album album = template.queryForObject(sql, rowMapper, id);
        return album;
    }

    public void updateAlbum(int id, Album album){
        String sql = "UPDATE track SET track_1 = ?, track_2 = ?, track_3 = ?, track_4 = ? WHERE id = ?";
        template.update(sql,album.getTrack_1(), album.getTrack_2(), album.getTrack_3(), album.getTrack_4(),album.getId());
    }


    public boolean deleteAlbum(int id){
        String sql = "DELETE FROM track WHERE id = ?";
        return template.update(sql, id) > 0;
    }
}
