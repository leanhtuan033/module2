package QuanLy_Coffee.Repository;

import QuanLy_Coffee.Entity.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkRepository {
    private static List<Drink> drinks = new ArrayList<>();

    static {
        drinks.add(new Drink(1, "Cafe sữa", 30000));
        drinks.add(new Drink(2, "Trà đào", 25000));
    }

    public List<Drink> findAll() {
        return drinks;
    }

    public void add(Drink drink) {
        drinks.add(drink);
    }

    public Drink findById(int id) {
        for (Drink drink : drinks) {
            if (drink.getId() == id) {
                return drink;
            }
        }
        return null;
    }

    public void delete(Drink drink) {
        drinks.remove(drink);
    }
}
