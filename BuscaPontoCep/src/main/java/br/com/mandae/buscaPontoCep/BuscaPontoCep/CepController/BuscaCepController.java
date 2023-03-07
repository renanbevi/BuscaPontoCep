package br.com.mandae.buscaPontoCep.BuscaPontoCep.CepController;

import br.com.mandae.buscaPontoCep.BuscaPontoCep.api.DadosCepApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class BuscaCepController {


    @Autowired
    private DadosCepApi adress;

    @Autowired
    private RestTemplate restTemplate;


    public String getBuscaCep(String postal_code){
        ResponseEntity<String> response =
                this.restTemplate.getForEntity("https://pudo-api.pontodrops.com.br/businessunits/api/v1/business-units/nearby/" + adress.postal_code() + "/", String.class);
        return response.getBody();
    }
}
