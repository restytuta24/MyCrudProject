package simplecrud.mycrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import simplecrud.mycrud.model.Customer;
import simplecrud.mycrud.model.Furniture;
import simplecrud.mycrud.service.CustomerService;

@Controller
public class Customer2Controller {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/kiraCustomers", method = RequestMethod.GET)
	public String saveCustomer() {
		Customer customer = new Customer(31, "guule", "guule@kal.ork", "kiti");
		customerService.saveCustomer(customer);
		return "westkla";

	}

	@RequestMapping(value = "/viewAllCustomers", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		List<Customer> currentCustomers = customerService.getAllCustomers();
		model.addAttribute("listYaange", currentCustomers);
		System.out.println(currentCustomers);
		return "listOfCustomers";
	}

	// lines 31 and 32 are binding the view to the list of customers we currently
	// have that is stored in the variable called
	// currentCustomers. This is when the view (page in the browser) will appear
	// with the list of customers we have created.

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return "deletePage";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("editCustomer", customer);
		return "updatePage";
	}
	
	@RequestMapping(value = "/finalupdate/{id}", method = RequestMethod.POST)
	public String updateFinalCustomer(@PathVariable("id") int id, @ModelAttribute("editCustomer") Customer customer) {
		System.out.println("data coming from the view" + customer);
		Customer updatedCustomer = customerService.getCustomerById(id);
		updatedCustomer.setUsername(customer.getUsername());
		updatedCustomer.setEmail(customer.getEmail());
		updatedCustomer.setPlaceOfResidence(customer.getPlaceOfResidence());
		System.out.println(updatedCustomer);
		customerService.updateCustomer(updatedCustomer);
		return "newchanges";
	}

	@RequestMapping(value = "/homeFurniture", method = RequestMethod.GET)
	public String homeFurniture(Model model) {

		return "bedroom";
	}

	@RequestMapping(value = "/furnitureOrder", method = RequestMethod.POST)
	public String furnitureOrder(@ModelAttribute("bedroomApparatus") Furniture furniture, Model model) {
		System.out.println("Your bedroom furniture order has been placed" + " " + furniture);
		model.addAttribute("FootStool", furniture);
		return "orders";
	}

}
