package mde.voll.api.controller;

import mde.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }



}
