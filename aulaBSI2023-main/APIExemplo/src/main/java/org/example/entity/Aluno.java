package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="aluno")
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Aluno {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @NotEmpty(message = "Nome não pode ser vazio")
    @Column(name = "nome")
    private String nome;


    @Column(name = "nas")
    @JsonFormat (pattern = "yyyy-mm-dd")
   // @NotNull (message = "Data obrigatória")
    private Date dataNas;

    @NotEmpty(message = "Não pode ser vazio!")
    @Column(name="cpf", length = 15)
    private String cpf;

}
