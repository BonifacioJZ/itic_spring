package com.itspa.itic.models.entity.itspa;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class New  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "new_id")
    private Long id;

    

    @ManyToMany
    @JoinTable(name = "tags_news",
    joinColumns = @JoinColumn(name="tag_id"),
    inverseJoinColumns = @JoinColumn(name="new_id"))
    private Set<Tag> tags;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private static  final long serialVersionUID = 6L;
}