package com.iniciativapro.barbershop.controller;

import java.security.Principal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iniciativapro.barbershop.dto.AgendamentoDTO;
import com.iniciativapro.barbershop.dto.CriarAgendamentoDto;
import com.iniciativapro.barbershop.model.Agendamento;
import com.iniciativapro.barbershop.model.Servico;
import com.iniciativapro.barbershop.model.Usuario;
import com.iniciativapro.barbershop.service.AgendamentoService;
import com.iniciativapro.barbershop.service.ServicoService;
import com.iniciativapro.barbershop.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@Transactional
public class AgendamentoController {
    @Autowired
    private AgendamentoService agendamentoService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ServicoService servicoService;


    @GetMapping("/agendamento")
    public ResponseEntity<List<AgendamentoDTO>> AllAgendamento(Principal principal){
        Usuario usuario = usuarioService.findByNomeUsuario(principal.getName());
        
        if(usuario != null){
            List<AgendamentoDTO> agendamento = agendamentoService.findAllAgendamentos(usuario);
            return ResponseEntity.ok().body(agendamento);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping("/agendamento")
    public ResponseEntity<AgendamentoDTO> CriarAgendamento(@RequestBody CriarAgendamentoDto criarAgendamentoDto, Principal principal){
        Usuario usuario = usuarioService.findByNomeUsuario(principal.getName());
        Servico servico = servicoService.findServico(criarAgendamentoDto.getIdServico());
        
        if(usuario != null && servico != null){
            LocalDate localDate = LocalDate.now();

            Agendamento agendamento = new Agendamento(localDate, usuario, servico);

            agendamentoService.save(agendamento);

            AgendamentoDTO agendamentoDto = new AgendamentoDTO(agendamento);

            return ResponseEntity.status(201).body(agendamentoDto);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/agendamento/{id}")
    public ResponseEntity<?> DeleteAgendamento(@PathVariable Long id, Principal principal){
        Usuario usuario = usuarioService.findByNomeUsuario(principal.getName());
        Optional<Agendamento> agendamento = agendamentoService.findByAgendamento(id);
        

        if(usuario != null && agendamento.isPresent()){
            agendamentoService.deleteAgendamento(id);
            return ResponseEntity.status(202).build();
        }

        return ResponseEntity.notFound().build();    
    }
}
