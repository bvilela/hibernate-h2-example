package br.com.bruno.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    
    public User() {}

    public User(long id, String nome, String email) {
    	this.id = id;
    	this.nome = nome;
    	this.email = email;
	}
    
    @Override
    public String toString() {
    	return "[id: " + id + ", nome: " + nome + ", email: " + email + "]";
    }

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
