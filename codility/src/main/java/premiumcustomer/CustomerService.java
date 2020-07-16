package premiumcustomer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public void updateCustomerToPremiumStatus(Customer customer) {
        if (!isFraud(customer)) {
            customer.updateToPremiumStatus();
            customerRepository.save(customer);
        }
    }

    private boolean isFraud(Customer customer) {
        return customer.getStatus().equals(Status.FRAUD);
    }
}
