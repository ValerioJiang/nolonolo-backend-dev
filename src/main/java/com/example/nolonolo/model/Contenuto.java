package com.example.nolonolo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "contenuto")
@Getter
@Setter
@NoArgsConstructor
public class Contenuto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "tipologia")
    private String tipologia; //video o immagine

    @Column(name = "file_path")
    private String filePath;

    // se cartellone è cartaceo gli si mette nullo
    @Column(name = "minuti")
    private int minuti;

    @Column(name = "secondi")
    private int secondi;

    @Column(name = "costo", columnDefinition = "DECIMAL(8,2)")
    private Double costo;

}
