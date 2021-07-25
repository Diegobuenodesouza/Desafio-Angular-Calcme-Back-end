package com.api.calcme.mapper;

import com.api.calcme.model.Cliente;
import com.api.calcme.model.dto.ClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toCliente(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();

        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setEmail(clienteDTO.getEmail());

        return cliente;
    };

    public ClienteDTO toClienteDto(Cliente cliente){
      ClienteDTO dto = new ClienteDTO();

        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setTelefone(cliente.getTelefone());
        dto.setEmail(cliente.getEmail());

        return dto;
    };

}
