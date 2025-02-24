package simplecrud.mycrud.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import simplecrud.mycrud.DAO.CustomerDAO;
import simplecrud.mycrud.model.Customer;

@Service 
public class CustomerServiceImpli implements CustomerService {
	
	@Autowired
	 private CustomerDAO customerDAO; // means we want to use the methods mentioned in CustomerDAO

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

}
