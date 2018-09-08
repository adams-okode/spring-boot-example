package com.example.sample.demo.clients;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByName(String name);
}