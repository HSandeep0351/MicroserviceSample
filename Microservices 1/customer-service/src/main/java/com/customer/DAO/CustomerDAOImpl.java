package com.customer.DAO;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
    private final CustomerRepository customerRepository;
    private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
	
	@Autowired
	public CustomerDAOImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

	
	public Customer addCustomer(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}

	@Override
	public Customer viewCustomer(Long customerId) {
		Customer customer=customerRepository.findById(customerId).get();
		return customer;
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		Customer updateCustomer=customerRepository.save(customer);
		return updateCustomer;
	}


	@Override
	public List<Customer> viewAllCustomers() {
		List<Customer> list=customerRepository.findAll();
		return list;
	}


	@Override
	public Customer deleteCustomer(Long customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
	    if (optionalCustomer.isPresent()) {
	        Customer customer = optionalCustomer.get();
	        customer.setDeleted(true);
	        return customerRepository.save(customer);
	    } else {
	        logger.error("Customer with ID {} not found", customerId);
	        return null; // or throw an exception if required
	    }
	}


	


	
	
	

}
