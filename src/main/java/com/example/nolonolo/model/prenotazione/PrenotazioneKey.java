package com.example.nolonolo.model.prenotazione;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class PrenotazioneKey implements Serializable {
    @Column(name = "cartellone_id")
    private Long cartelloneId;

    @Column(name = "contenuto_id")
    private Long contenutoId;
}
