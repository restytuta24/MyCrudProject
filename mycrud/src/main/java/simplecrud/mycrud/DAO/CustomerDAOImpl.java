package simplecrud.mycrud.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import simplecrud.mycrud.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
		}
		
	
	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, new Integer(id));
		if(null != customer){
			session.delete(customer);
		}
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, new Integer(id));
		return customer;
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		List<Customer> customerList = session.createQuery("from Customer").list();
		return customerList;
	}

   
}
