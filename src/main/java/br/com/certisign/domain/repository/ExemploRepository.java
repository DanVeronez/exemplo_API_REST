package br.com.certisign.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.certisign.domain.model.Exemplo;


@Repository
public interface ExemploRepository extends JpaRepository<Exemplo, Long> {

}
