package dev.Raul.Cadastro.CRUD.Ninjas;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {


    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    @GetMapping("/boasvindas")
    public String boasVindas() {

        return "Esta é minha primeira menssagem nessa rota";
    }


    //Adicionar Ninja (Create)

    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {

        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso:" + novoNinja.getNome() + " (ID): " + novoNinja.getId());
    }

    //Mostrar todos os ninjas (Read)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {

        List<NinjaDTO> ninjas =  ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    //Mostrar Ninja por id (Read)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) {

        NinjaDTO ninjasId = ninjaService.listarNinjasId(id);

        if (ninjasId != null) {
            return ResponseEntity.ok(ninjasId);


        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Não encontradp");
        }


    }

    //Alterar dados dos ninjas (Update)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaID(@PathVariable Long id, NinjaDTO ninjaAtualizado) {

        NinjaDTO ninja = ninjaService.atualizarNinja(id, ninjaAtualizado);

        if (ninja != null) {
            return ResponseEntity.ok(ninja);

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Não encontrado");
        }

    }

    //Deletar ninjas (Delete)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNInjaID(@PathVariable Long id) {

        if (ninjaService.listarNinjasId(id) != null) {
            ninjaService.deletarNinjaId(id);
            return ResponseEntity.ok()
                    .body("Ninja deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Não encotrado!");
        }

    }


}
