/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entites;

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
 * @author hp
 */
@Entity
@Table(name = "IMAGETABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagetable.findAll", query = "SELECT i FROM Imagetable i")
    , @NamedQuery(name = "Imagetable.findByImageid", query = "SELECT i FROM Imagetable i WHERE i.imageid = :imageid")
    , @NamedQuery(name = "Imagetable.findByImagename", query = "SELECT i FROM Imagetable i WHERE i.imagename = :imagename")
    , @NamedQuery(name = "Imagetable.findByImagepath", query = "SELECT i FROM Imagetable i WHERE i.imagepath = :imagepath")})
public class Imagetable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IMAGEID")
    private Integer imageid;
    @Size(max = 50)
    @Column(name = "IMAGENAME")
    private String imagename;
    @Size(max = 100)
    @Column(name = "IMAGEPATH")
    private String imagepath;

    public Imagetable() {
    }

    public Imagetable(Integer imageid) {
        this.imageid = imageid;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageid != null ? imageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imagetable)) {
            return false;
        }
        Imagetable other = (Imagetable) object;
        if ((this.imageid == null && other.imageid != null) || (this.imageid != null && !this.imageid.equals(other.imageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entites.Imagetable[ imageid=" + imageid + " ]";
    }
    
}
