package com.itspa.itic.models.entity.itspa;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tags")
public class Tag implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long id;

    @ManyToMany(mappedBy = "tags")
    private Set<New> news;


    public Tag() {
    }

    public Tag(Long id, Set<New> news) {
        this.id = id;
        this.news = news;
    }

    public Set<New> getNews() {
        return this.news;
    }

    public void setNews(Set<New> news) {
        this.news = news;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private static  final long serialVersionUID = 6L;

}