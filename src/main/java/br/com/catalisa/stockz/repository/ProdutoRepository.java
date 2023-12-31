package br.com.catalisa.stockz.repository;

import br.com.catalisa.stockz.model.Categoria;
import br.com.catalisa.stockz.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findByCategoria(Categoria categoria);
    @Query("SELECT p FROM Produto p WHERE p.nome = :nome")
    List<Produto> findAllByNome(String nome);

}
