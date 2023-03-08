package br.com.mandae.buscaPontoCep.BuscaPontoCep.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;



@Builder
public record DadosCepApiDTO(

         String adress,
         String number,
         String complement,
         String district,
         String line,
         String city,
         String state,
         String id,
         String name,
         @JsonAlias({"spostal_code", "postalcode"}) String postalcode,
         @JsonAlias({"social_name", "socialName"}) String socialName,
         @JsonAlias ({"reference_point", "referencepoint"}) String referencepoint){



}
