package Java_Seminar.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {

    private static LinkedList<String> list = new LinkedList<>();

    public static void run() {
        boolean getIteration = true;
        while (getIteration) {
            String cmd = inputUser("Enter the command");
            String[] cLine = cmd.split("~");
            switch (cLine[0].toUpperCase()) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    while (list.size() > 0) {
                        System.out.println(list.pollFirst());
                    }
                    break;
                case "REVERSE":
                    while (list.size() > 0) {
                        System.out.println(list.pollLast());
                    }
                    break;
                default:
                    list.add(cLine[0]);
                    break;
            }
        }
    }

    private static String inputUser(String message) {
        System.out.print(message + " -> ");
        Scanner scannerNumber = new Scanner(System.in);
        return scannerNumber.nextLine();
    }
}

