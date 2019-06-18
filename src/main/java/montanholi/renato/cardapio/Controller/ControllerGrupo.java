package montanholi.renato.cardapio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import montanholi.renato.cardapio.models.Grupo;
import montanholi.renato.cardapio.repository.RepositoryGrupo;

@RestController
public class ControllerGrupo {

	@Autowired
	private RepositoryGrupo groupRep;
	
	@RequestMapping(value = "/grupos")
	public List<Grupo> index() {
		List<Grupo> groupList = groupRep.findAll();
		return groupList;
	}
	
	@RequestMapping(value = "/grupos", method = RequestMethod.POST)
	public Grupo inserir(Grupo grupo) throws Exception {
		if(grupo.getId() != null) {
			new Exception("NÃO DEVE TER ID RAPÁ");
		}
		groupRep.save(grupo);
		return grupo;
	}
	
	@RequestMapping(value = "/grupos", method = RequestMethod.PUT)
	public Grupo alterar(Grupo grupo) {
		if(grupo.getId() == null) {
			new Exception("PRECISA TER ID RAPÁ");
		}
		groupRep.save(grupo);
		return grupo;
	}
	
	@RequestMapping(value = "/grupos", method = RequestMethod.DELETE)
	public Grupo deletar(Grupo grupo) {
		if(grupo.getId() == null) {
			new Exception("PRECISA TER ID RAPÁ");
		}
		groupRep.delete(grupo);
		return grupo;
	}


	
	
	
}
