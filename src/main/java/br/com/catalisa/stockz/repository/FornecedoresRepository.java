package br.com.catalisa.stockz.repository;

import br.com.catalisa.stockz.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FornecedoresRepository extends JpaRepository<Fornecedor, Long> {
    Optional<Fornecedor> findByEmail(String email);

}
