package com.jiangjf.pojo;

import java.io.Serializable;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = -8401823426305564738L;
    private Integer id;
    private String name;

    public Dept() {
    }

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
