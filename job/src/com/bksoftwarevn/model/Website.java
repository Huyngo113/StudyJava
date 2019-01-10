/**
 *
 */
package com.bksoftwarevn.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author manhnd
 *
 */
public class Website extends Basic implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String url;
    private String name;
    private boolean deleted;

    public Website() {
    }

    public Website(String url, String name, boolean deleted) {
        this.url = url;
        this.name = name;
        this.deleted = deleted;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Website other = (Website) obj;
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        return true;
    }

    @Override
    public void show(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
