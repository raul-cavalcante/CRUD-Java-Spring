package dev.Raul.Cadastro.CRUD.Ninjas;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {


    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {

        return ninjaService.listarNinjas();
    }

    //Mostrar Ninja por id (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {

        return ninjaService.listarNinjasId(id);
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
