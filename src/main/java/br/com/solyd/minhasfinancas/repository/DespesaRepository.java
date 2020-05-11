package br.com.solyd.minhasfinancas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solyd.minhasfinancas.domain.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
