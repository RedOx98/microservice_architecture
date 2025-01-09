package com.olahammed.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
       Customer  customer = Customer.builder()
               .firstName(request.firstName())
               .lastName(request.lastName())
               .email(request.email())
               .build();

        Customer customer1 = new Customer(1,request.firstName(),request.lastName(),request.email());
        customer1.setId(1);
        customer1.setFirstName(request.firstName());
        customer1.setLastName(request.lastName());
        customer1.setEmail(request.email());


//        todo: check if email is valid
//        todo: check if password is valid
//        todo: store customer in db
customerRepository.save(customer);
    }
}
