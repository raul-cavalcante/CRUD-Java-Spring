package dev.Raul.Cadastro.CRUD.Missoes;

import dev.Raul.Cadastro.CRUD.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;


    //1 missão para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
