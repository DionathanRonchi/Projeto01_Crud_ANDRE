package com.example.crud_spring2931.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {
@id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nome;
private int idade;

//lombok gera tudo automaticamente
// getId, getNome, getIdade
// setid, setNome, setIdade

}
