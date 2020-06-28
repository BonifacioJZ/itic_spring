package com.itspa.itic.models.entity.itspa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "files")
public class File implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long id;
    
    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    private String name;

    @NotEmpty
    @Min(value = 1)
    @Max(value = 100)
    private String description;

    private String file;



    public File() {
    }


    public File(Long id, String name, String description, String file) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.file = file;
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private static  final long serialVersionUID = 6L;

}