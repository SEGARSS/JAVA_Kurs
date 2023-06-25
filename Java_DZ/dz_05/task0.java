package Java_DZ.dz_05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class task0 {
    public static void printSortedPB(HashMap<String, ArrayList<Integer>> pBook) {
        HashMap<String, ArrayList<Integer>> printPB = new HashMap<String, ArrayList<Integer>>();
        printPB = pBook;

        while (printPB.size() > 0) {
            String name = mostPopularName(printPB);
            System.out.println(name + ": " + printPB.remove(name).toString().replace("[", "").replace("]", "") + ";");
        }

    }

    public static HashMap<String, ArrayList<Integer>> fillPB(String fname) {

        HashMap<String, ArrayList<Integer>> pBook = new HashMap<String, ArrayList<Integer>>();
        ArrayList<String> phones = readFile(fname);

        String[] contact;
        
        for (String item : phones) {
            ArrayList<Integer> list = new ArrayList<>();
            contact = item.split(":");

            if (pBook.containsKey(contact[0])) {
                list = pBook.get(contact[0]);
            }

            list.add(Integer.parseInt(contact[1].replace(" ", "")));
            pBook.put(contact[0], list);

        }

        return pBook;
    }

    private static String mostPopularName(HashMap<String, ArrayList<Integer>> pBook) {
        String name = "";

        Set<String> names = pBook.keySet();

        int numMax = 0;
        for (String n : names) {
            int sz = pBook.get(n).size();
            if (sz > numMax) {
                numMax = sz;
                name = n;
            }
        }

        return name;
    }

    private static ArrayList<String> readFile(String fname) {
        ArrayList<String> phones = new ArrayList<>();
        try {
            File file = new File(fname);
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line = reader.readLine();
                while (line != null) {
                    phones.add(line);
                    line = reader.readLine(); 
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phones;
    }
}
