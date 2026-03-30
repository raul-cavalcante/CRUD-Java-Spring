package dev.Raul.Cadastro.CRUD.Ninjas;

import dev.Raul.Cadastro.CRUD.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;
    private int idade;

    //1 ninja tem uma missão

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;


}
