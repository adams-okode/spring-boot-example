package com.example.sample.demo.clients;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClientController
 */

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value="/clientDetails", method = RequestMethod.GET)
    public Optional getClient(@RequestParam("id") Long id) {
        return clientService.findParticularClient(id);

    }

    @RequestMapping(value="/clients", method= RequestMethod.GET)
    public List getAllClients() {
        return clientService.getAllClients();
    }

    @RequestMapping(value="/clientCreate", method = RequestMethod.POST)
    public void createClient(@RequestBody Client client) {
        clientService.createClient(client);
    }

    @RequestMapping(value="/clientDelete", method = RequestMethod.DELETE)
    public void deleteClient(@RequestParam("id") Long id) {
        clientService.deleteClientRecord(id);
    }

    @RequestMapping(value="/clientUpdate", method = RequestMethod.PUT)
    public void updateClient(@RequestBody Client client, @RequestParam("id") Long clientId) {
        clientService.updateClientRecord(client, clientId);
    }

}