package com.itspa.itic.models.entity.itspa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "academic_training")
public class AcademicTraining implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "A_id")
    private Long id;
    
    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    private String name;

    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    @Column(name = "institution")
    private String institucion;

    @NotEmpty
    @Min(value = 1)
    @Max(value = 10)
    @Column(name = "abbreviation")
    private String abrebiacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Nivel nivel;
    private static  final long serialVersionUID = 3L;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitucion() {
        return this.institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }


    public String getAbrebiacion() {
        return this.abrebiacion;
    }

    public void setAbrebiacion(String abrebiacion) {
        this.abrebiacion = abrebiacion;
    }
   


}