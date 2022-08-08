package com.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_temas")
public class Tema {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull(message = "O atributo Descrição é obrigatório")
private String descricao;

/*Insira os Getters and Setters*/
public Long getId() {
return this.id;
}
public void setId(Long id) {
this.id = id;
}
public String getDescricao() {
return this.descricao;
}
public class tema {

}}