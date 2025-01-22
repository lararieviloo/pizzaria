package com.zup.pizzaria.services;
import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.dtos.ClienteRequestDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo para listar todos os clientes e convertê-los em DTOs
    public List<ClienteDTO> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        // Convertendo a lista de entidades para uma lista de DTOs
        return clientes.stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome()))
                .collect(Collectors.toList());
    }

    // Metodo para salvar um novo cliente
    public ClienteDTO salvarCliente(ClienteRequestDTO clienteRequestDTO) {
        // Convertendo o DTO para a entidade Cliente
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequestDTO.getNome());
        cliente.setEmail(clienteRequestDTO.getEmail());

        // Salvar no banco de dados
        Cliente clienteSalvo = clienteRepository.save(cliente);

        // Retornando o cliente salvo como DTO
        return new ClienteDTO(clienteSalvo.getId(), clienteSalvo.getNome());
    }
}