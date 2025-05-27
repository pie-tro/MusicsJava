package itu.fatec.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import itu.fatec.teste.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{

    
}