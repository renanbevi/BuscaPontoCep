package br.com.mandae.buscaPontoCep.BuscaPontoCep.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class CepApiClient {

    @Value("${cep.apikey}")
    private String apikey;

    @Autowired
    private RestTemplate restTemplate;


}
