package com.example.nolonolo.model.prenotazione;

import com.example.nolonolo.model.Cartellone;
import com.example.nolonolo.model.Contenuto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prenotazione")
@Getter
@Setter
@NoArgsConstructor
public class Prenotazione {

    @EmbeddedId
    private PrenotazioneKey id;

    @ManyToOne
    @MapsId("cartelloneId")
    @JoinColumn(name="cartellone_id")
    private Cartellone cartellone;

    @ManyToOne
    @MapsId("contenutoId")
    @JoinColumn(name="contenuto_id")
    private Contenuto contenuto;

    @Column(name = "data_visione")
    private Date dataVisione;

}
