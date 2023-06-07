/* Функции и методы */
public class Lesson_01_11 {
    static void sayHi() {
        System.out.println("hi!");
        }
        static int sum(int a, int b) {
        return a+b;
        }
        static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
        }
        public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}
/*ПРимеры вызова описанных методов и функций. Как в одном файле, написали и решили много задач,
и чтобы не вызывать все решения всех задач а только конкретно одно, прописываем этот метод, а другие
закоментируем чтобы не мешали.*/
