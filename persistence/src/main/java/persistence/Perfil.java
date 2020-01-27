package persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perfil {
	
	@Id
	private int id;

	private String descricao;

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
