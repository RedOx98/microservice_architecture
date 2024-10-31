package org.olahammed.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
       Customer  customer = Customer.builder()
               .firstName(request.firstName())
               .lastName(request.lastName())
               .email(request.email())
               .build();

//        Customer customer = new Customer(1,request.firstName(),request.lastName(),request.email());
//        customer.setId(1);
//        customer.setFirstName(request.firstName());
//        customer.setLastName(request.lastName());
//        customer.setEmail(request.email());


//        todo: check if email is valid
//        todo: check if password is valid
//        todo: store customer in db
customerRepository.save(customer);
    }
}
