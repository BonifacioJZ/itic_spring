package com.itspa.itic.models.entity.itspa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "nivel")
public class Nivel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    private String nombre;

    @NotEmpty
    private String descripcion;


    @OneToMany(mappedBy = "nivel",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<AcademicTraining> academicTraining;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public List<AcademicTraining> getAcademicTraining() {
        return this.academicTraining;
    }

    public void setAcademicTraining(List<AcademicTraining> academicTraining) {
        this.academicTraining = academicTraining;
    }

    private static  final long serialVersionUID = 5L;


}