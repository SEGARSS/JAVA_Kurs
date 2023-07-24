package Java_DZ.dz_12;

/*Здача №3.
Переписать код в соответствии с Interface Segregation Principle:

public interface Shape {
double area();
double volume();
}
public class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double area() {
return 2 * 3.14 * radius;
}
@Override
public double volume() {
throw new UnsupportedOperationException();
}
}
public class Cube implements Shape {
private int edge;
public Cube(int edge) {
this.edge = edge;
}
@Override
public double area() {
return 6 * edge * edge;
}
@Override
public double volume() {
return edge * edge * edge;
}
}
​
Подсказка: круг не объемная фигура и этому классу не нужен метод volume().*/

/**
 * Точка входа.
 */
public class task3_ISP {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.area());

        SolidShape cube = new Cube(4);
        System.out.println("Площадь куба: " + cube.area());
        System.out.println("Объём куба: " + cube.volume());
    }
}

/**
 * Интерфейс, представляющий фигуру.
 */
interface Shape {
    double area();
}

/**
 * Интерфейс, представляющий объемную фигуру.
 */
interface SolidShape extends Shape {
    double volume();
}

/**
 * Класс, представляющий круг.
 */
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

/**
 * Класс, представляющий куб.
 */
class Cube implements SolidShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
