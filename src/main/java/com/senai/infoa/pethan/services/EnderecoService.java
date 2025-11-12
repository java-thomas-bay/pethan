package com.senai.infoa.pethan.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.infoa.pethan.models.Endereco;
import com.senai.infoa.pethan.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

     public Endereco salvar(String cep, long numero, String referencia) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setNumero(numero);
        endereco.setReferencia(referencia);
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
    }
    
        public boolean buscar(Integer Id) {
        Endereco endereco = enderecoRepository.findById(Id).get();
        if(endereco != null){
           enderecoRepository.findById(Id);
            return true;
  
        }

        return false;

}
}
