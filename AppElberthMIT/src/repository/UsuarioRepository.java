package repository;

import domain.Usuario;

public class UsuarioRepository {
	
	public static Usuario validar(String login, String senha) {
		
		if(login.equalsIgnoreCase(senha)) {
			return new Usuario(login, senha);
		}
		
		return null;
		
	}

}
