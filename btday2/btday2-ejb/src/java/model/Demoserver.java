/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tuan anh
 */
@Entity
@Table(name = "DEMOSERVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demoserver.findAll", query = "SELECT d FROM Demoserver d")
    ,@NamedQuery(name = "Demoserver.checkLogin", query = "SELECT d FROM Demoserver d WHERE d.username = :username AND d.password = :password")
    , @NamedQuery(name = "Demoserver.findById", query = "SELECT d FROM Demoserver d WHERE d.id = :id")
    , @NamedQuery(name = "Demoserver.findByUsername", query = "SELECT d FROM Demoserver d WHERE d.username = :username")
    , @NamedQuery(name = "Demoserver.findByPassword", query = "SELECT d FROM Demoserver d WHERE d.password = :password")})

public class Demoserver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;

    public Demoserver() {
    }

    public Demoserver(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demoserver)) {
            return false;
        }
        Demoserver other = (Demoserver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Demoserver[ id=" + id + " ]";
    }
    
}
