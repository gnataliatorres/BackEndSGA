package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "salon")
@Entity
public class Salon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_salon")
    private Long codigoSalon;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "unidad")
    private String unidad;
}
