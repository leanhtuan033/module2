package QuanLy_Coffee.Service.impl;

import QuanLy_Coffee.Entity.Drink;
import QuanLy_Coffee.Repository.DrinkRepository;
import QuanLy_Coffee.Service.IDrinkService;

import java.util.List;
import java.util.Scanner;

public class DrinkService implements IDrinkService {
    private DrinkRepository repository = new DrinkRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Drink> findAll() {
        return repository.findAll();
    }

    @Override
    public void add(Drink drink) {
        repository.add(drink);
    }

    @Override
    public void delete(int id) {

        Drink drink = repository.findById(id);

        if (drink != null) {
            repository.delete(drink);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy món");
        }
    }

    @Override
    public void edit(int id) {

        Drink drink = repository.findById(id);

        if (drink != null) {

            System.out.print("Nhập tên mới: ");
            String newName = scanner.nextLine();

            System.out.print("Nhập giá mới: ");
            double newPrice = Double.parseDouble(scanner.nextLine());

            drink.setName(newName);
            drink.setPrice(newPrice);

            System.out.println("Sửa thành công");

        } else {
            System.out.println("Không tìm thấy món");
        }
    }

    @Override
    public Drink findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void searchByName(String name) {

        boolean found = false;

        for (Drink drink : repository.findAll()) {

            if (drink.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(drink);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy món");
        }
    }

    @Override
    public void calculateBill() {

        double total = 0;

        System.out.print("Nhập số món muốn mua: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.print("Nhập ID món: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            Drink drink = repository.findById(id);

            if (drink != null) {
                total += drink.getPrice() * quantity;
            }
        }

        System.out.println("Tổng tiền: " + total);
    }
}
