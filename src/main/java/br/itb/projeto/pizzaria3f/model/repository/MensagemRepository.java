package br.itb.projeto.pizzaria3f.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends JpaRepository<MensagemRepository, Long> {

}
