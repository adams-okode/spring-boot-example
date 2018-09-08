
package com.example.sample.demo.clients;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    
    public List<Client> getAllClients() {

        List<Client> Clients = new ArrayList<>();
		clientRepository.findAll().forEach(Clients::add);
		return Clients;

    }

    public Optional<Client> findParticularClient(Long id) {

        return clientRepository.findById(id);

    }

    public Boolean createClient(Client client){
        try{
            clientRepository.save(client);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public boolean deleteClientRecord(Long id){
        try{
            clientRepository.deleteById(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    public boolean updateClientRecord(Client client, Long clientId){
        try{
            clientRepository.save(client);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }


    

}
