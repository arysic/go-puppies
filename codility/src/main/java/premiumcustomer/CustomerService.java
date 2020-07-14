package premiumcustomer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public void updateCustomerToPremiumStatus(Customer customer) {
        if (!customer.getStatus().equals(Status.FRAUD)) {
            customer.setStatus(Status.PREMIUM);
            customerRepository.save(customer);
        }
    }
}
