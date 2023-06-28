package Java_Seminar;

import java.util.ArrayList;
import java.util.List;


import Java_Seminar.Seminar7.Domen.Bottle;
import Java_Seminar.Seminar7.Domen.Product;
import Java_Seminar.Seminar7.Services.CoinDispenser;
import Java_Seminar.Seminar7.Services.Display;
import Java_Seminar.Seminar7.Services.Holder;
import Java_Seminar.Seminar7.Services.VendingMachine;


public class Seminar_07 {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }

       

        
    }
}

