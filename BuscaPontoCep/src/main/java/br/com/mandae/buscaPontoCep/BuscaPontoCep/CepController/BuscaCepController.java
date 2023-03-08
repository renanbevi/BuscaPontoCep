package br.com.mandae.buscaPontoCep.BuscaPontoCep.CepController;

import br.com.mandae.buscaPontoCep.BuscaPontoCep.api.DadosCepApi;
import br.com.mandae.buscaPontoCep.BuscaPontoCep.api.DadosListagemPontos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


public class BuscaCepController {

    @Autowired
    private DadosListagemPontos dadosListagemPontos;
    @Autowired
    private DadosCepApi adress;

    @Autowired
    private RestTemplate restTemplate;




    @RequestMapping(value = "/cep/{postalcode}", method = RequestMethod.GET)
    public DadosListagemPontos getBuscaCep(@PathVariable(value = "postalCode") String postalCode){
        ResponseEntity<DadosListagemPontos> response =
                this.restTemplate.getForEntity("https://pudo-api.pontodrops.com.br/businessunits/api/v1/business-units/nearby/" + adress.postal_code() + "/", DadosListagemPontos.class);
        return response.getBody();
    }
}
