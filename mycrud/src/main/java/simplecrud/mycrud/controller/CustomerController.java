package simplecrud.mycrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import simplecrud.mycrud.model.Customer;
//import simplecrud.mycrud.model.Employees;
//import simplecrud.mycrud.DAO.CustomerDAOImpl;
//
//import java.util.List;
//
//@Controller
//public class CustomerController {
//
//    // Inject the CustomerDAOImpl (or service layer) into the controller
//    CustomerDAOImpl customerDAO = new CustomerDAOImpl();
//
//
//    // Display a list of all customers
//    @RequestMapping(value = "/customers", method = RequestMethod.GET)
//    public String listCustomers(Model model) {
//        List<Customer> customers = customerDAO.getAllCustomers();
//        model.addAttribute("customers", customers); // Add customers to the model
//        return "customerList"; // Return the view name (JSP or Thymeleaf)
//    }
//
//    // Show the form to create a new customer
//    @RequestMapping(value = "/new", method = RequestMethod.GET)
//    public String showCreateCustomerForm(Model model) {
//        model.addAttribute("customer", new Customer(0, "", "", "")); // Add a new Customer to the model
//        return "createCustomer"; // Return the view name for creating a customer
//    }
//
//    // Save the customer (handle form submission)
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveCustomer(Customer customer) {
//        customerDAO.saveCustomer(customer); // Save the customer to the list (simulating DB)
//        return "redirect:/customers"; // Redirect to the list page after saving
//    }
//
//    // Show the form to update an existing customer
//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public String showEditCustomerForm(@PathVariable("id") int id, Model model) {
//        Customer customer = customerDAO.getCustomerById(id); // Retrieve the customer by id
//        if (customer != null) {
//            model.addAttribute("customer", customer); // Add customer to the model
//            return "editCustomer"; // Return the view for editing customer details
//        } else {
//            return "redirect:/customers"; // If customer not found, redirect to the list page
//        }
//    }
//
//    // Update the customer (handle form submission for updates)
////    @RequestMapping(value = "/update", method = RequestMethod.POST)
////    public String updateCustomer(Customer customer) {
////        customerDAO.updateCustomer(customer); // Update the customer in the list
////        return "redirect:/customers"; // Redirect to the list page after updating
////    }
//
//    // Delete a customer
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public String deleteCustomer(@PathVariable("id") int id) {
//    //    customerDAO.deleteCustomer(id); // Delete the customer by id
//        return "redirect:/customers"; // Redirect to the list page after deleting
//    }
//    @RequestMapping(value = "/Resty", method = RequestMethod.GET)
//    public String myResty(Model model) {
//    	model.addAttribute("TutaGirl", "A girl of all seasons whose life is an open book, no secrets, so skeletons in the closet");
//    	return "Resty";
//    	
//    }
//    @RequestMapping(value = "/healthyLiving", method = RequestMethod.GET)
//    public String healthyLiving(Model model) {
//    	model.addAttribute("loveYourSelf", "Look Good, Smell good, exercise");
//    	return "youFirst";
//    }
//    @RequestMapping(value = "/gratitude", method = RequestMethod.GET)
//    public String gratitude(Model model) {
//    	model.addAttribute("gratitude", "Be grateful to God for his mercies edure for ever");
//    	return "practiceGratitude";
//    }
//    
////    @RequestMapping(value = "/today", method = RequestMethod.GET)
////    public String Today(Model model) {
////    	Employees abakozi = new Employees("Resty Tuta", "IT", 23);
//    	
////    	model.addAttribute("Tuesday", abakozi); // here the controller is able to send the view information using 'model.addAttributes'
////    	return "highsAndLows";
////    }
////    @RequestMapping(value = "/academy", method = RequestMethod.POST)
////    public String academy(@ModelAttribute("customer") Customer customer) {
////    	System.out.println("this customer nsasa is coming from the view" + " " + customer);
//////    	Customer customer = new Customer(101, "Kayongo", "Kayongo@academy.org", "Kira");
//////    	model.addAttribute("Staff", customer);
////    	return "helo";
//    }
//    @RequestMapping(value = "/team", method = RequestMethod.GET)
//    public String team(Model model) {
//    	
//    	return "myEmployees";
//    }
//}
