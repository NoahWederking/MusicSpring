package com.example.springmusic.service;

import com.example.springmusic.model.Album;
import com.example.springmusic.repository.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlbumService {
    @Autowired
    AlbumRepo albumRepo;

    public List<Album> fetchAll(){
        return albumRepo.fetchAll();
    }

    public void addAlbum(Album album){
        albumRepo.addAlbum(album);
    }

    public Album findAlbumById(int id){
        return albumRepo.findAlbumById(id);
    }

    public void updateAlbum(int id, Album album){
        albumRepo.updateAlbum(id, album);
    }

    public boolean deleteAlbum(int id){
       return albumRepo.deleteAlbum(id);
    }
}
