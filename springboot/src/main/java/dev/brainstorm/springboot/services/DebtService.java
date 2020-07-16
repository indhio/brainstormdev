package dev.brainstorm.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.brainstorm.springboot.DB;
import dev.brainstorm.springboot.entity.Debt;

/**
 * @author indhio
 *
 */
@Service
public class DebtService {

	/**
	 * @return
	 */
	public List<Debt> listAll() {
		return DB.getInstance().getDebts();
	}

	/**
	 * @param id
	 * @return
	 */
	public Debt getDebtById(Long id) {
		return DB.getInstance().getDebtById(id);
	}

	/**
	 * 
	 * @param obj
	 * @return
	 */
	public Debt create(Debt obj) {
		return DB.getInstance().addDebt(obj);
	}
 
	/**
	 * @param obj
	 * @return
	 */
	public Debt update(Debt obj) {
		return DB.getInstance().updateDebt(obj);
	}

	/**
	 * Remove element by ID
	 * 
	 * @param id
	 * @return
	 */
	public Boolean delete(Long id) {
		return DB.getInstance().removeDebt(id);
	}

}
