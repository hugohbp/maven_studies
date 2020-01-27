package dao;

import java.util.List;
import java.util.Optional;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import persistence.Usuario;

@Stateless
public class UsuarioDAO implements Dao<Usuario> {

	@PersistenceContext(unitName = "aaa")
	private EntityManager entityManager;

	public Optional<Usuario> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> getAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
		Root<Usuario> rootEntry = cq.from(Usuario.class);
		CriteriaQuery<Usuario> all = cq.select(rootEntry);
		TypedQuery<Usuario> allQuery = entityManager.createQuery(all);
		return allQuery.getResultList();
	}

	public void save(Usuario t) {
		// TODO Auto-generated method stub

	}

	public void update(Usuario t, String[] params) {
		// TODO Auto-generated method stub

	}

	public void delete(Usuario t) {
		// TODO Auto-generated method stub

	}

}
