package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "puesto")
public class Puesto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_puesto")
    private  Long codigoPuesto;
    @Column(name = "descripcion")
    private  String descripcion;
}
