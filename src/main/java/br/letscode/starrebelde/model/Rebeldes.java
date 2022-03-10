package br.letscode.starrebelde.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Rebeldes {
    String nome;
    int idade;
    boolean genero;
    String[] localizacao;
    String[] inventario;
}
