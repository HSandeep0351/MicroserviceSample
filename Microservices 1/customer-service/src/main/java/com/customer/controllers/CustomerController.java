package com.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.customer.DAO.CustomerDAO;
import com.customer.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
    private final CustomerDAO customerDAO;
	
	@Autowired
	public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("Shubham Bhoknal");
	}
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		Customer customerAdd=customerDAO.addCustomer(customer);
		return ResponseEntity.ok(customerAdd);
	}
	
	@GetMapping("/id/{customerId}")
    public ResponseEntity<Customer> viewCustomer(@PathVariable Long customerId) {
    	Customer viewwCustomer = customerDAO.viewCustomer(customerId);
        return ResponseEntity.ok(viewwCustomer);
    }
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		Customer updateCustomer=customerDAO.updateCustomer(customer);
		return ResponseEntity.ok(updateCustomer);
	}
//	@GetMapping("/AllCustomers")
//	public ResponseEntity<List<Customer>> viewAllCustomers(){
//		List<Customer> allCustomers=customer(@PathVariable Long id){
//		Customer deletedCustomer=customerDAO.deleteCustomer(id);
//		return ResponseEntity.ok(deletedCustomer);
//	}
}
