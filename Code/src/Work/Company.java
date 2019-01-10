/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;
import java.util.Date;

/**
 *
 * @author Ngo Huy
 */
public class Company {
    
    private int id;
    private String name;
    private String address;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Company other = (Company) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    private String decs;
    private String wepside;
    private String logo;
    private Date modify;

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + ", address=" + address + ", decs=" + decs + ", wepside=" + wepside + ", logo=" + logo + ", modify=" + modify + ", deleted=" + deleted + ", MAX=" + MAX + '}';
    }
    private boolean deleted;
    public final int MAX = 30;
    public static final String CLB = "CLBITSV";

    public Company() {
    }
    
    public Company(int id, String name, String address, String decs, String wepside, String logo, Date modify, boolean deleted) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.decs = decs;
        this.wepside = wepside;
        this.logo = logo;
        this.modify = modify;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public String getWepside() {
        return wepside;
    }

    public void setWepside(String wepside) {
        this.wepside = wepside;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getModify() {
        return modify;
    }

    public void setModify(Date modify) {
        this.modify = modify;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    public void showinforcp(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.decs);
        System.out.println(this.deleted);
        System.out.println(this.logo);
        System.out.println(this.modify);
        System.out.println(this.wepside);
    } 
    
    
}
