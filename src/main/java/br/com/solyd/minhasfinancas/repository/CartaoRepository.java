package br.com.solyd.minhasfinancas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solyd.minhasfinancas.domain.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

}
