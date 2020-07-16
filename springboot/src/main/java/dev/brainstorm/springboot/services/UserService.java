package dev.brainstorm.springboot.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.brainstorm.springboot.entity.User;

@Service
public class UserService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public List<User> listAll() {
		return setList();
	}
	
	public User getUserById(Long id) {
		return new User(id);
	}
	
	private List<User> setList() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1L, "Vinicius", "viniciusnitt@gmail.com"));
		users.add(new User(2L, "Lais", "lais@gmail.com"));
		users.add(new User(3L, "Renan", "renan@gmail.com"));
		return users;
	}

}
