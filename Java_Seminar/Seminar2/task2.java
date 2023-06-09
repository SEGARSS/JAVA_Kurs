package Java_Seminar.Seminar2;
/*Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.*/
public class task2 {
    public static void execute(){
        String input = "aaaabbbcdd";
        String compressed = compressString(input);
        System.out.println(compressed);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }
}

