package interfaces;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import interfaces.Abstract.BaseCustomerManager;
import interfaces.Concrete.NeroCustomerManager;
import interfaces.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Mehmet", "Koç", LocalDate.of(1998,10,30), "12341234123"));
	}

}
