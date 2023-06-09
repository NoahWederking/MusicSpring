package com.example.springmusic.controller;

import com.example.springmusic.model.Album;
import com.example.springmusic.model.Musician;
import com.example.springmusic.service.AlbumService;
import com.example.springmusic.service.MusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    MusicianService musicianService;


    @GetMapping("/")
    public String index(Model model){
        List<Musician> musicianList = musicianService.fetchAll();
        model.addAttribute("musician", musicianList);
        return "home/index";
    }


    @GetMapping("/create")
    public String addMusician(){
        return "home/create";
    }

    @PostMapping("/createNewMusician")
    public String createNew(@ModelAttribute Musician musician){
        musicianService.addMusician(musician);
        return "redirect:/";
    }









}
