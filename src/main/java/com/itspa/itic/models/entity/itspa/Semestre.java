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

import com.itspa.itic.models.entity.itic.Matter;

@Entity
@Table(name = "semestre")
public class Semestre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    private String name;


    @OneToMany(mappedBy = "semestre",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Matter> matters;



    public Semestre() {
    }


    public Semestre(Long id, String name, List<Matter> matters) {
        this.id = id;
        this.name = name;
        this.matters = matters;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Matter> getMatters() {
        return this.matters;
    }

    public void setMatters(List<Matter> matters) {
        this.matters = matters;
    }



    private static  final long serialVersionUID = 5L;
}