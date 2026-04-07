package dev.Raul.Cadastro.CRUD.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String ListarMissao() {
        return "Listar missao";
    }
    @PostMapping("criar")
    public String criarMissao() {
        return "Criar missao";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Alterar missao";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Deletar missao";
    }

}
