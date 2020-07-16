package premiumcustomer;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private Status status; // Status.FRAUD, Status.NORMAL, Status.PREMIUM

    public void updateToPremiumStatus() {
        status = Status.PREMIUM;
    }
}
