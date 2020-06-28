package com.itspa.itic.models.entity.itspa;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.itspa.itic.models.entity.People;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(referencedColumnName = "p_id")
public class Teacher extends People {
    

    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date createAt;


    public Teacher() {
        super();
    }


    public Teacher(Long id, String nombre, String apellidos, String email, String picture) {
        super(id, nombre, apellidos, email, picture);
        // TODO Auto-generated constructor stub
    }


    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(final Date createAt) {
        this.createAt = createAt;
    }

    private static  final long serialVersionUID = 2L;

}