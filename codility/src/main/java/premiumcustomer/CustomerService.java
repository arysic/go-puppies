package premiumcustomer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public void updateCustomerToPremiumStatus(Customer customer) {

        customer.setStatus(customer.getStatus().equals(Status.FRAUD) ? Status.FRAUD : Status.PREMIUM);

        customerRepository.save(customer);
    }
}
