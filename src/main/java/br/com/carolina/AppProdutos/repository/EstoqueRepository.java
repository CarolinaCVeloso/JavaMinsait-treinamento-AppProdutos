package br.com.carolina.AppProdutos.repository;

import br.com.carolina.AppProdutos.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository <Estoque, Long> {


}
