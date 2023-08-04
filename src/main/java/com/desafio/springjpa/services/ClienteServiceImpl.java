package com.desafio.springjpa.services;

import com.desafio.springjpa.entity.Cliente;
import com.desafio.springjpa.repo.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ClienteServiceImpl implements IClienteServ {
    @Autowired
    public IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
       return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        clienteDao.deleteById(id);
    }
}
