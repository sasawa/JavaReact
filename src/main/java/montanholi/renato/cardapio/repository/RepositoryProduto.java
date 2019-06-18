package montanholi.renato.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import montanholi.renato.cardapio.models.Produto;

public interface RepositoryProduto extends JpaRepository<Produto, Long>{
}