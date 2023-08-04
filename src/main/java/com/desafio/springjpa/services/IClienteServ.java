package com.desafio.springjpa.services;

import com.desafio.springjpa.entity.Cliente;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface IClienteServ {

    public List<Cliente> findAll();

    public Cliente save (Cliente cliente);

    public Cliente findById(Long id);

    public void deleteById(Long id);

}
