package com.example.nolonolo.model;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cartellone")
@Getter
@Setter
@NoArgsConstructor
public class Cartellone {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "larghezza", columnDefinition="Decimal(8,2)")
    private BigDecimal larghezza;

    @Column(name = "altezza", columnDefinition="Decimal(8,2)")
    private BigDecimal altezza;

    @Column(name = "condizione")
    private String condizione;

    @Column(name = "tipologia")
    private String tipologia;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "latitudine", columnDefinition="Decimal(10,2)")
    private BigDecimal latitudine;

    @Column(name = "longitudine", columnDefinition="Decimal(10,2)")
    private BigDecimal longitudine;

}
