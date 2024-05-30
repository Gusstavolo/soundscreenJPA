package com.gglo.screensound.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Artistas")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoArtista tipo;

    

    private List<Musicas> musicas = new ArrayList<>();



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public TipoArtista getTipo() {
        return tipo;
    }



    public void setTipo(TipoArtista tipo) {
        this.tipo = tipo;
    }



    public List<Musicas> getMusicas() {
        return musicas;
    }



    public void setMusicas(List<Musicas> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return  "Artista='" + nome + '\''+
                ", tipo=" + tipo +
                ", musicas=" + musicas;
    }
}
