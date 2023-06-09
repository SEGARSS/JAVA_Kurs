package Java_Seminar.Seminar2;
/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.*/
public class task1 {
    public static void execute() {
        int N = 15; // Длина строки
        char c1 = 'A'; // Первый символ
        char c2 = 'B'; // Второй символ

        String result = createAlternatingString(N, c1, c2);
        System.out.println(result);
    }

    public static String createAlternatingString(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}

