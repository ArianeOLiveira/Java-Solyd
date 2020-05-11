package br.com.solyd.minhasfinancas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solyd.minhasfinancas.domain.Transferencia;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

}
