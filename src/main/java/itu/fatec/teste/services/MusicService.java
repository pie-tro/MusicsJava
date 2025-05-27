package itu.fatec.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itu.fatec.teste.entities.Music;
import itu.fatec.teste.repositories.MusicRepository;

@Service
public class MusicService{
    
    @Autowired
    private MusicRepository repository;

    public List<Music> getAll(){
        return repository.findAll();
    }
    public Music save(Music music){
        return repository.save(music);
    }
}
