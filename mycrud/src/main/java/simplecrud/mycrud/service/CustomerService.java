package simplecrud.mycrud.service;

import java.util.List;

import simplecrud.mycrud.model.Customer;

public interface CustomerService {
	
	   // Method to save a customer
	   public void saveCustomer(Customer customer);

	    // Method to update an existing customer
	   public void updateCustomer(Customer customer);

	    // Method to delete a customer by ID
	   public void deleteCustomer(int id);

	    // Method to get a customer by ID
	    Customer getCustomerById(int id);

	    // Method to get all customers
	    List<Customer> getAllCustomers();

}
