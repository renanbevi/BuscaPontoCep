package br.com.mandae.buscaPontoCep.BuscaPontoCep.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;

@Builder
public record DadosCepApi(

         String adress,
         String postal_code,
         String number,
         String complement,
         String district,
         String line,
         String city,
         String state,
         String id,
         String name,
         @JsonAlias({"social_name", "socialName"}) String socialName,

         @JsonAlias({"ostal_code", "postalCode"}) String postalcode,

         @JsonAlias ({"reference_point", "referencepoint"}) String referencepoint){



}
