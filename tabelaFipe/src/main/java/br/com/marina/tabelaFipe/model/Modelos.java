package br.com.marina.tabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)//ignora a propriedades anos
public record Modelos(List<Dados> modelos) {
}
