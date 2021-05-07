package Adapter;

import interfaces.Abstract.CustomerChechkService;
import interfaces.Entities.Customer;

public class MernisServiceAdapter implements CustomerChechkService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
	
}
