package com.desafio.springjpa.repo;

import com.desafio.springjpa.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
