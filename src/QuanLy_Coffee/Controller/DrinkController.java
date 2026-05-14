package QuanLy_Coffee.Controller;

import QuanLy_Coffee.Entity.Drink;
import QuanLy_Coffee.Service.IDrinkService;
import QuanLy_Coffee.Service.impl.DrinkService;

import java.util.List;

public class DrinkController {
    private IDrinkService drinkService = new DrinkService();

    public List<Drink> getAll() {
        return drinkService.findAll();
    }

    public void add(Drink drink) {
        drinkService.add(drink);
    }

    public void delete(int id) {
        drinkService.delete(id);
    }

    public void edit(int id) {
        drinkService.edit(id);
    }

    public void search(String name) {
        drinkService.searchByName(name);
    }

    public void calculateBill() {
        drinkService.calculateBill();
    }
}
