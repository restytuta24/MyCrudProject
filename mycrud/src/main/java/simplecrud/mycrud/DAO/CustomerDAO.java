package simplecrud.mycrud.DAO;

import java.util.List;

import simplecrud.mycrud.model.Customer;

public interface CustomerDAO {

    // Method to save a customer
   public void saveCustomer(Customer customer);

    // Method to update an existing customer
   public void updateCustomer(Customer customer);

    // Method to delete a customer by ID
   public void deleteCustomer(int id);

    // Method to get a customer by ID
   public Customer getCustomerById(int id);

    // Method to get all customers
   public List<Customer> getAllCustomers();
}

