package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "curso")
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_curso")
    private Long codigoCurso;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "numero_alumnos")
    private int numeroAlumnos;

}
