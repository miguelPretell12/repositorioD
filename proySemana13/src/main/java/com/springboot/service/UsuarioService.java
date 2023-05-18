package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.model.Rol;
import com.springboot.model.Usuario;
import com.springboot.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = repository.findByUsername(username);
		List<GrantedAuthority>roles = new ArrayList<>();
		for(Rol role: user.getRol()) {
			//Admin - Supervisor  - Estudiante
			roles.add(new SimpleGrantedAuthority(role.getRolname()));
			
		}
		
		UserDetails userdet = new User(user.getUsername(), user.getPassword(), roles);
				
		return userdet;
	}
	
}
