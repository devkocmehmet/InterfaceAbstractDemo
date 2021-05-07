package interfaces.Concrete;

import interfaces.Abstract.BaseCustomerManager;
import interfaces.Abstract.CustomerChechkService;
import interfaces.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private CustomerChechkService _customerCheckService;
	
	public NeroCustomerManager(CustomerChechkService customerCheckService) {
		this._customerCheckService = customerCheckService;
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
