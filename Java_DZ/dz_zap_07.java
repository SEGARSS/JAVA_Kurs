package Java_DZ;

import java.util.ArrayList;
import java.util.List;


import Java_DZ.dz_07.Domen.Bottle;
import Java_DZ.dz_07.Domen.HotDrink; // Добавили горячие напитки
import Java_DZ.dz_07.Domen.Product;
import Java_DZ.dz_07.Services.CoinDispenser;
import Java_DZ.dz_07.Services.Display;
import Java_DZ.dz_07.Services.Holder;
import Java_DZ.dz_07.Services.VendingMachine;

/*
1. Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) 
с дополнительным полем int температура.
2. Для класса ГорячихНапитков(Hot Drink) 
написать конструктор и переопределить метод toString()
3. В main добавить в автомат несколько ГорячихНапитков(Hot Drink) 
и воспроизвести логику заложенную в программе
*/


public class dz_zap_07 {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        HotDrink item4 = new HotDrink(120, 4, "Tea", 102, 80);
        HotDrink item5 = new HotDrink(90, 5, "Coffee", 103, 70);
        HotDrink item6 = new HotDrink(110, 6, "Hot Chocolate", 104, 65);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }

        HotDrink tea = (HotDrink)venMachine.getProducts().get(3);
        System.out.println("Temperature of Tea: " + tea.getTemperature());
                
       
    }
}
