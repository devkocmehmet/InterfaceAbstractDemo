package interfaces.Concrete;

import interfaces.Abstract.CustomerChechkService;
import interfaces.Entities.Customer;

public class CustomerCheckManager implements CustomerChechkService{
	public boolean CheckIfRealPerson(Customer customer) {
		return true; 
	}

}
