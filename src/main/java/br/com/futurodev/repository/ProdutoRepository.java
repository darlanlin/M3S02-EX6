package br.com.futurodev.repository;

import br.com.futurodev.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

    }
