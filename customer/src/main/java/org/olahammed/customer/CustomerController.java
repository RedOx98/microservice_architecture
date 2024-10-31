package org.olahammed.customer;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    

    @PostMapping("/register-customer")
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
//        log
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
