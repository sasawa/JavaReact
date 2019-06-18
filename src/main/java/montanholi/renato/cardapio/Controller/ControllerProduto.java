package montanholi.renato.cardapio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import montanholi.renato.cardapio.models.Produto;
import montanholi.renato.cardapio.repository.RepositoryProduto;

@RestController
public class ControllerProduto {

	@Autowired
	private RepositoryProduto produtoRep;
	
	@RequestMapping(value = "/produtos")
	public List<Produto> index() {
		List<Produto> groupList = produtoRep.findAll();
		return groupList;
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public Produto inserir(Produto produto) throws Exception {
		if(produto.getId() != null) {
			new Exception("NÃO DEVE TER ID RAPÁ");
		}
		produtoRep.save(produto);
		return produto;
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.PUT)
	public Produto alterar(Produto produto) {
		if(produto.getId() == null) {
			new Exception("PRECISA TER ID RAPÁ");
		}
		produtoRep.save(produto);
		return produto;
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.DELETE)
	public Produto deletar(Produto produto) {
		if(produto.getId() == null) {
			new Exception("PRECISA TER ID RAPÁ");
		}
		produtoRep.delete(produto);
		return produto;
	}


	
	
	
}
