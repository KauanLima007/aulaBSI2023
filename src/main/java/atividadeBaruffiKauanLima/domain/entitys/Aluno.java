package atividadeBaruffiKauanLima.domain.entitys;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name = "Aluno")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Aluno {



    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer Id;

   @Column(name = "Nome")
   @NotEmpty (message = "Campo Obrigatório")
    private String name;

   @Column(name = "DataNas")
   @NotNull(message = "Data Obrigatório")
   @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dataNas;

   @Column(name = "CPF", length = 15)
   @NotEmpty(message = "CPF Obrigatório")
    private String cpf;


}
