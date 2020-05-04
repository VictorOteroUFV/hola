package vaadin_archetype_application.JMA1231;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaUsuario {
	
	@Test
	public void instanciarUsuario() {
		Usuario u = new Usuario ("pablo", "cabanyes", "ufv", 623, "soypablo", "callemaravilla");
		assertEquals("pablo", u.getNombre());
	}
	@Test
	public void addusuarioLista() {
		Usuario u = new Usuario ("pablo", "cabanyes", "ufv", 623, "soypablo", "callemaravilla");
		Lista list =new Lista();
		list.addusuario(u);
		assertEquals(1,list.listasize());
	}
	
}
