package com.projeto.workshop.Entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class User implements Serializable {

    private Long id;
    private String nome;
    private String email;
    private String celular;
    private String senha;

    public User(){

    }

    public User(Long id, String nome, String email, String celular, String senha) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
