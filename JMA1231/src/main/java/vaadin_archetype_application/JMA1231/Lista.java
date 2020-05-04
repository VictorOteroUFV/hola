package vaadin_archetype_application.JMA1231;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<Usuario> usuarios;
	
	public Lista() {
		usuarios =new ArrayList<Usuario>();
	}
	public void addusuario(Usuario u) {
		usuarios.add(u);
	}
	
	public int listasize() {
		return usuarios.size();
	
	}

}
