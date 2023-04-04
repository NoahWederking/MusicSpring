package com.example.springmusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.springmusic.model.Album;
import com.example.springmusic.model.Musician;
import com.example.springmusic.service.AlbumService;
import com.example.springmusic.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("/addAlbum")
    public String addAlbumTracks(){
        return "home/addTrack";
    }

    @PostMapping("/addTheTracks")
    public String addTheTracks(@ModelAttribute Album album){
        albumService.addAlbum(album);
        return "redirect:/";
    }
    @GetMapping("/seeTracks")
    public String index1(Model model){
        List<Album> albumList = albumService.fetchAll();
        model.addAttribute("album", albumList);
        return "home/viewTracks";
    }

    @GetMapping("/editAlbum/{id}")
    public String editAlbum(@PathVariable("id") int id, Model model){
        model.addAttribute("album", albumService.findAlbumById(id));
        return "home/updateAlbum";
    }

    @GetMapping("/updateAlbum")
    public String editAlbum(@ModelAttribute Album album){
        albumService.updateAlbum(album.getId(),album);
        return "redirect:/";
    }

    @GetMapping("/deleteAlbum/{id}")
    public String deleteAlbum(@PathVariable("id") int id){
        boolean isDeleted = albumService.deleteAlbum(id);
        if(isDeleted){
            return "redirect:/";
        } else {

            return "redirect:/";
        }
    }

}
