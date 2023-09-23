package org.example.entity;


// Entidades são usadas para criar o banco de dados e as tabelas deste banco



import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table (name = "Aluno")
@AllArgsConstructor
@Data
@NoArgsConstructor


public class Aluno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private int id;

    @Column (name = "Nome")
    @NotEmpty (message = "Campo obrigatório")
    private String name;
    @NotNull (message = "Data obrigatoria")
    @Column (name = "nas")
    @JsonFormat (pattern = "yyyy-mm-dd")
    private Date dataNas;


    @Column (name = "cpf", length = 15)
    @NotEmpty (message = "Não pode ser vazio")
    private String cpf;

}
