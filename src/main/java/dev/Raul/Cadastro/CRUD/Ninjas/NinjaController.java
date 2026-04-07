package dev.Raul.Cadastro.CRUD.Ninjas;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Esta é minha primeira menssagem nessa rota";
    }

    //Adicionar Ninja (Create)

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Mostrar todos os ninjas (Read)
    @GetMapping("/todos")
    public String mostrarTodosNinjas() {
        return "Ninjas";
    }

    //Mostrar Ninja por id (Read)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasID() {
        return "Ninjas ID";
    }

    //Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaID() {
        return "Atualizar ninja";
    }

    //Deletar ninjas (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNInjaID() {
        return "Deletar ninja";
    }


}
