package montanholi.renato.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import montanholi.renato.cardapio.models.Grupo;

public interface RepositoryGrupo extends JpaRepository<Grupo, Long>{
}