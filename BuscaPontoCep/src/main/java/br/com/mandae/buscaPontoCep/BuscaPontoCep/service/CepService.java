package br.com.mandae.buscaPontoCep.BuscaPontoCep.service;

import br.com.mandae.buscaPontoCep.BuscaPontoCep.api.DadosCepApiDTO;
import org.springframework.web.client.RestTemplate;

public class CepService {

    public DadosCepApiDTO getCepService(String postal_code){


        return new RestTemplate()
                .getForEntity("https://pudo-api.pontodrops.com.br/businessunits/api/v1/business-units/nearby/" + postal_code + "?max_distance_in_meters=10000", DadosCepApiDTO.class).getBody();


    }
}
