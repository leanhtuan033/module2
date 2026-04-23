package Clean_code.Service;

import Clean_code.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> list = new ArrayList<>();

    public void add(Customer c) {
        list.add(c);
    }

    public void remove(String name) {
        list.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public List<Customer> findAll() {
        return list;
    }

    public List<Customer> search(String keyword) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : list) {
            if (c.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
}
