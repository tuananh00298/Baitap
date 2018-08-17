/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

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
@Table(name = "TBDOITAC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbdoitac.findAll", query = "SELECT t FROM Tbdoitac t")
    , @NamedQuery(name = "Tbdoitac.findById", query = "SELECT t FROM Tbdoitac t WHERE t.id = :id")
    , @NamedQuery(name = "Tbdoitac.findByCodeDt", query = "SELECT t FROM Tbdoitac t WHERE t.codeDt = :codeDt")
    , @NamedQuery(name = "Tbdoitac.findByPasswordDt", query = "SELECT t FROM Tbdoitac t WHERE t.passwordDt = :passwordDt")})
public class Tbdoitac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "CODE_DT")
    private String codeDt;
    @Size(max = 255)
    @Column(name = "PASSWORD_DT")
    private String passwordDt;

    public Tbdoitac() {
    }

    public Tbdoitac(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeDt() {
        return codeDt;
    }

    public void setCodeDt(String codeDt) {
        this.codeDt = codeDt;
    }

    public String getPasswordDt() {
        return passwordDt;
    }

    public void setPasswordDt(String passwordDt) {
        this.passwordDt = passwordDt;
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
        if (!(object instanceof Tbdoitac)) {
            return false;
        }
        Tbdoitac other = (Tbdoitac) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demo.Tbdoitac[ id=" + id + " ]";
    }
    
}
