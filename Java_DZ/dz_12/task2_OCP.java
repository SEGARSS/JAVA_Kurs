package Java_DZ.dz_12;

/*Здача №2.
Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

public class SpeedCalculation {
public double calculateAllowedSpeed(Vehicle vehicle) {
if (vehicle.getType().equalsIgnoreCase("Car")) {
return vehicle.getMaxSpeed() * 0.8;
} else if (vehicle.getType().equalsIgnoreCase("Bus")) {
return vehicle.getMaxSpeed() * 0.6;
}
​
return 0.0;
}
}
public class Vehicle {
int maxSpeed;
String type;
public Vehicle(int maxSpeed, String type) {
this.maxSpeed = maxSpeed;
this.type = type;
}
public int getMaxSpeed() {
return this.maxSpeed;
}
public String getType() {
return this.type;
}
}
​
Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), 
напишите метод calculateAllowedSpeed(). 
Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP*/

/**
 * Основной класс для демонстрации использования SpeedCalculation а также task2_OCP точка входа.
 */
public class task2_OCP {
    public static void main(String[] args) {
        Vehicle car = new Car(200);
        Vehicle bus = new Bus(120);

        SpeedCalculation speedCalculation = new SpeedCalculation();

        System.out.println("Разрешонная скорость для автомобиля: " + speedCalculation.calculateAllowedSpeed(car));
        System.out.println("Разрешённая скорость для автобуса: " + speedCalculation.calculateAllowedSpeed(bus));
    }
}

/**
 * Основной класс для демонстрации использования SpeedCalculation.
 */
abstract class Vehicle {
    private int maxSpeed;
    private String type;


    /**
     * Конструктор для класса Vehicle.
     *
     * @param maxSpeed максимальная скорость транспортного средства
     * @param type     тип транспортного средства
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Получить максимальную скорость транспортного средства.
     *
     * @return максимальная скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Получить тип транспортного средства.
     *
     * @return тип транспортного средства
     */
    public String getType() {
        return this.type;
    }

    /**
     * Рассчитать разрешенную скорость для транспортного средства.
     *
     * @return разрешенная скорость
     */
    public abstract double calculateAllowedSpeed();
}

/**
 * Конкретный класс, представляющий автомобиль, тип транспортного средства.
 */
class Car extends Vehicle {

    /**
     * Конструктор для класса Car.
     *
     * @param maxSpeed максимальная скорость автомобиля
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Машина");
    }

    /**
     * Рассчитать разрешенную скорость для автомобиля.
     *
     * @return разрешенная скорость для автомобиля
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

/**
 * Конкретный класс, представляющий автобус, тип транспортного средства.
 */
class Bus extends Vehicle {

    /**
     * Конструктор для класса Bus.
     *
     * @param maxSpeed максимальная скорость автобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Атобус");
    }

    /**
     * Рассчитать разрешенную скорость для автобуса.
     *
     * @return разрешенная скорость для автобуса
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}

/**
 * Класс для расчета разрешенной скорости транспортного средства.
 */
class SpeedCalculation {

    /**
     * Рассчитать разрешенную скорость для заданного транспортного средства.
     *
     * @param vehicle транспортное средство, для которого нужно рассчитать разрешенную скорость
     * @return разрешенная скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}


