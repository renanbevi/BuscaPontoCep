package br.com.mandae.buscaPontoCep.BuscaPontoCep.CepController;

import br.com.mandae.buscaPontoCep.BuscaPontoCep.api.DadosCepApiDTO;
import br.com.mandae.buscaPontoCep.BuscaPontoCep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cep")
public class BuscaCepController {

    @Autowired
    private CepService cepService;
    @Autowired
    private DadosCepApiDTO adress;

    @Autowired
    private RestTemplate restTemplate;


    @ResponseBody
    @GetMapping(value="/cep-pudos/{postal_code}")
    public ResponseEntity<DadosCepApiDTO> getBuscaPonto(@PathVariable("postal_code")String postal_code){
        DadosCepApiDTO dadosCepApiDTO = cepService.getCepService(postal_code);
        return new ResponseEntity<DadosCepApiDTO>(dadosCepApiDTO, HttpStatus.OK);
    }


   // @RequestMapping(value = "/cep/{postal_code}", method = RequestMethod.GET)
   // public DadosListagemPontos getBuscaCep(@PathVariable(value = "postal_Code") String postalCode){
        //ResponseEntity<DadosListagemPontos> response =
          //      this.restTemplate.getForEntity(";
        //return response.getBody();
    //}
}
