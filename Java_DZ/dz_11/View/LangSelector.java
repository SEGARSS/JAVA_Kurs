package Java_DZ.dz_11.View;

import java.util.Scanner;

import Java_DZ.dz_11.Controller.iGetView;

public class LangSelector {
    
    public static iGetView select() {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Choose the language / Выберите язык (1 - English, 2 - Русский): ");
        int choice = Integer.parseInt(iScan.nextLine());

        if (choice == 1) {
            return new ViewEng();
        } else {
            return new ViewRus();
        }
    }

}
