package itu.fatec.teste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itu.fatec.teste.entities.Music;
import itu.fatec.teste.services.MusicService;



@RestController
@RequestMapping("musics")
public class MusicController{
    @Autowired
    private MusicService service;
    @GetMapping
    public ResponseEntity<List<Music>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
    @PostMapping
    public ResponseEntity<Music> save(@RequestBody Music music){
        return ResponseEntity.created(null).body(service.save(music));
    } 
}
