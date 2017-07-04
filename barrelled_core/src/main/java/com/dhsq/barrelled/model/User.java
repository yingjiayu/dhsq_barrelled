package com.dhsq.barrelled.model;

/**
 * Created by jerry on 2017/7/2.
 */
public class User {
    private Integer id;
    private String name;

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

    public User (Integer id, String name){
        this.id =id;
        this.name =name;
    }
}
