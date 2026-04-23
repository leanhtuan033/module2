package Clean_code.Controller;

import Clean_code.Service.CustomerService;
import Clean_code.View.CustomerView;

public class CustomerController {
    private CustomerService service = new CustomerService();
    private CustomerView view = new CustomerView();

    public void run() {
        while (true) {
            view.menu();
            int choice = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

            switch (choice) {
                case 1:
                    view.display(service.findAll());
                    break;

                case 2:
                    service.add(view.inputCustomer());
                    break;

                case 3:
                    String name = view.inputName();
                    service.remove(name);
                    break;

                case 4:
                    String keyword = view.inputName();
                    view.display(service.search(keyword));
                    break;

                case 0:
                    return;
            }
        }
    }
}
