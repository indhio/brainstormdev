package dev.brainstorm.springboot;

import java.util.ArrayList;
import java.util.List;

import dev.brainstorm.springboot.entity.Debt;
import dev.brainstorm.springboot.entity.User;

public class DB {

	private static DB instance = null;

	public static List<User> users;
	public static List<Debt> debts;

	public static DB getInstance() {
		if (instance == null) {
			instance = new DB();
			
			users = new ArrayList<User>();
			users.add(new User(1L, "Vinicius", "viniciusnitt@gmail.com"));
			users.add(new User(2L, "Lais", "lais@gmail.com"));
			users.add(new User(3L, "Renan", "renan@gmail.com"));
			
			debts = new ArrayList<Debt>();
			debts.add(new Debt(1L, "1", "2"));
			debts.add(new Debt(2L, "1", "2"));
			debts.add(new Debt(3L, "1", "3"));
		}
		return instance;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public User getUserById(Long id) {
		for (User user: users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User addUser(User user) {
		users.add(user);
		return user;
	}
	
	public boolean removeUser(Long id) {
		for (User user: users) {
			if (user.getId() == id) {
				users.remove(user);
			}
		}
		return true;
	}
	
	public User updateUser(User obj) {
		for (User user: users) {
			if (user.getId() == obj.getId()) {
				users.remove(user);
				users.add(obj);
			}
		}
		return obj;
	}
	
	public List<Debt> getDebts() {
		return debts;
	}
	
	public Debt getDebtById(Long id) {
		for (Debt debt: debts) {
			if (debt.getId() == id) {
				return debt;
			}
		}
		return null;
	}

	
	public Debt addDebt(Debt debt) {
		debts.add(debt);
		return debt;
	}
	
	public boolean removeDebt(Long id) {
		Debt debtToRemove = null;
		for (Debt debt: debts) {
			if (debt.getId() == id) {
				debtToRemove = debt;
			}
		}
		debts.remove(debtToRemove);
		return true;
	}
	
	public Debt updateDebt(Debt obj) {
		for (Debt debt: debts) {
			if (debt.getId() == obj.getId()) {
				debts.remove(debt);
				debts.add(obj);
			}
		}
		return obj;
	}

}
