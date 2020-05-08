package com.example.ddd;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    private String id;
    private String title;
    //イミュータブルを実現するために値のセットはコンストラクタのみとする。Setterは作らない
    public Book(String id,String title) {
        super();
        this.id = id;
        this.title = title;
    }
    public Book() {
        super();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
