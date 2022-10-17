package com.acn.sustainability.hackathon.springboot.hackathonspringboot.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Company")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @ManyToMany
    @JoinTable(name="company_has_ods", joinColumns=
    {@JoinColumn(name="company_id")}, inverseJoinColumns=
    {@JoinColumn(name="ods_id")})
    private Set<Ods> objetivosOds = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company id(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Company name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Ods> getObjetivosOds(){
        return this.objetivosOds;
    }

    public Company objetivosOds(Set<Ods> objetivosOds) {
        this.objetivosOds = objetivosOds;
        return this;
    }

    public void setObjetivosOds(Set<Ods> objetivosOds) {
        this.objetivosOds = objetivosOds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Company)) {
            return false;
        }
        return id != null && id.equals(((Company) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + getId() +
            ", descricao='" + getName() + 
            ", objetivosOds='" + getObjetivosOds() + "'" +
            "}";
    }
}