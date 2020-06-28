package com.itspa.itic.models.entity.itspa;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.itspa.itic.models.entity.People;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
@PrimaryKeyJoinColumn(referencedColumnName = "p_id")
public class User extends People{

    

    @NotEmpty
    @Min(value = 8)
    @Max(value = 64)
    private String username;

    @NotEmpty
    @Min(value = 8)
    @Max(value = 32)
    private String password;
    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date createAt;


    public User() {
        super();
    }


    public User(Long id, String nombre, String apellidos, String email, String picture, String username,String password) {
        super(id, nombre, apellidos, email, picture);
        this.password = password;
        this.username = username;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private static  final long serialVersionUID = 2L;
}


    
