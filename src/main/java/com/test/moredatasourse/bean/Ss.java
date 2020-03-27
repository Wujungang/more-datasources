package com.test.moredatasourse.bean;

public class Ss {
    Integer id;
    String name;

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
        return "Ss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
