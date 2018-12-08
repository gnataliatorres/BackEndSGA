package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "grupoAcademico")
@Entity
public class GrupoAcademico implements Serializable{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "codigo_grupo_academico")
        private Long codigoGrupoAcademico;
        @Column(name = "descripcion")
        private String descripcion;
}
