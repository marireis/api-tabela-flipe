package br.com.marina.tabelaFipe.service;

import java.util.List;

//interface para converter dados
public interface IConverteDados {
    //obtem o dado do tipo
    <T> T obterDados(String json, Class<T> classe);//cabeçalho generico, converte dados para uma classe

    //obtem uma lista do tipo
    <T> List<T> obterLista(String json, Class<T> classe);

    //para pegar a lista de marcas

}
