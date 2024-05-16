package com.customer.DAO;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerDAO {
	public Customer addCustomer(Customer customer);

	public Customer viewCustomer(Long customerId);
	
	public Customer updateCustomer(Customer customer);
	
	public List<Customer> viewAllCustomers();

	public Customer deleteCustomer(Long customerId);

}
