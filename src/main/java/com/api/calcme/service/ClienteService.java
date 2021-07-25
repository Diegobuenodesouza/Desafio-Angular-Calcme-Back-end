package com.api.calcme.service;

import com.api.calcme.mapper.ClienteMapper;
import com.api.calcme.model.Cliente;
import com.api.calcme.model.dto.ClienteDTO;
import com.api.calcme.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    @Transactional
    public ClienteDTO insertCliente(ClienteDTO clienteDTO){
        Cliente cliente = clienteMapper.toCliente(clienteDTO);
        clienteRepository.insert(cliente);
        return clienteMapper.toClienteDto(cliente);
    }
}
