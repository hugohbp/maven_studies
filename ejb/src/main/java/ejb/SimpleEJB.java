package ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.Dao;
import dao.UsuarioDAO;
import persistence.Usuario;

@Stateless
public class SimpleEJB {

	@EJB
	private Dao<Usuario> usuarioDAO;

	public String chamada() {
		List<Usuario> usuarios = this.usuarioDAO.getAll();
		return "FOI";
	}

}
