package br.com.carolina.AppProdutos.service.serviceImpl;

import br.com.carolina.AppProdutos.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoServiceInterface {
    Produto save(Produto produto);
    Optional<Produto> getById(Long id);
    List<Produto> getAll();
    Produto update(Produto produto);
    void deletePorId(Long id);

}
