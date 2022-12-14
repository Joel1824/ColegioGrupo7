package idat.grupo7.pe.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import idat.grupo7.pe.model.Usuario;
import idat.grupo7.pe.repository.UsuarioRepository;



@Service
public class UserDetailService implements UserDetailsService {
	
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usu = repository.findByUsuario(username);
		
		if(usu != null) {
			
			List<GrantedAuthority> listGranted = new ArrayList<>();
			GrantedAuthority granted = new SimpleGrantedAuthority(usu.getRol());
			listGranted.add(granted);
			
			return new User(
					usu.getUsuario(),
					usu.getContrasenia(),
					listGranted);
		}else {
			throw new UsernameNotFoundException("Usuario no existe " + username);
		}
		
		/*if( "profesor".equals(username)) {
			return new User("profesor",  new BCryptPasswordEncoder().encode("123"), new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Usuario no existe " + username);
		}*/
	}

}
