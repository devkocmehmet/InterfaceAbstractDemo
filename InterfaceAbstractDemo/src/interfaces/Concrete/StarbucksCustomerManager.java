package interfaces.Concrete;

import interfaces.Abstract.BaseCustomerManager;
import interfaces.Abstract.CustomerChechkService;
import interfaces.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerChechkService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerChechkService customerChecckService) {
		this._customerCheckService = customerChecckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" veritabanýna kaydedildi.");
		}else {
			System.out.println("Hata kullanýcý doðrulanamadý.");
		}
	}
}
