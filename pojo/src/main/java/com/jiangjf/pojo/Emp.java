package com.jiangjf.pojo;

import java.io.Serializable;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
public class Emp implements Serializable {
    private static final long serialVersionUID = -6648208434901006412L;
    private Integer id;
    private String name;
    private String photo;
    private Integer did;

    public Emp() {
    }

    public Emp(Integer id, String name, String photo, Integer did) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.did = did;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", did=" + did +
                '}';
    }
}
