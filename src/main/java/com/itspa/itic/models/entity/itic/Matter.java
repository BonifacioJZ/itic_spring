package com.itspa.itic.models.entity.itic;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.itspa.itic.models.entity.itspa.Semestre;

import org.springframework.format.annotation.DateTimeFormat;

import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
@Table(name = "matters")
public class Matter implements Serializable {
    
    @Id
    private String clave;
    
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    
    private int horasPracticas;
    
    private int horasEscritas;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Semestre semestre;
    //archivo
    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date createAt;

    private static  final long serialVersionUID = 4L;


    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHorasPracticas() {
        return this.horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public int getHorasEscritas() {
        return this.horasEscritas;
    }

    public void setHorasEscritas(int horasEscritas) {
        this.horasEscritas = horasEscritas;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }



}