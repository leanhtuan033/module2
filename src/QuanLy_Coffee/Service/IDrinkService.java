package QuanLy_Coffee.Service;

import QuanLy_Coffee.Entity.Drink;

public interface IDrinkService extends IService<Drink> {
    void searchByName(String name);

    void calculateBill();

}
