package Java_Seminar.Seminar13.Adapter;

public class main {
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        SensorTemperature newSensor = new ST500Info().getData();

        AdapterST500 adapter = new AdapterST500(newSensor);
        meteoDb.save(adapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}

