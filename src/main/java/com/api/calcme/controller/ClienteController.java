package com.api.calcme.controller;

import com.api.calcme.model.dto.ClienteDTO;
import com.api.calcme.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDTO> insertCliente(@RequestBody ClienteDTO clienteDtoBody){
        ClienteDTO dto = clienteService.insertCliente(clienteDtoBody);
        return ResponseEntity.ok().body(dto);
    };
}
