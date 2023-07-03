/**
 * Программа "Market"
 * Версия: 1.0
 * 
 * Эта программа моделирует работу магазина и взаимодействие клиентов с ним.
 * Клиенты могут быть обычными клиентами, клиентами со специальным статусом
 * (например, VIP-клиентами) или пенсионерами. Программа также включает службу
 * налоговой, которая следит за заказами клиентов.
 * 
 * Все клиенты реализуют интерфейс iActorBehaviour, который определяет методы
 * для управления заказами клиентов. Класс Market представляет магазин и
 * реализует интерфейсы iMarketBehaviour и iQueueBehaviour для управления
 * очередью и заказами клиентов. Класс Actor является абстрактным классом,
 * от которого наследуются все типы клиентов. Классы OrdinaryClient,
 * SpecialClient и PensionerClient представляют соответствующие типы клиентов.
 * 
 * Класс TaxService представляет службу налоговой и также реализует интерфейс
 * iActorBehaviour. Класс PromotionalClient представляет клиента с акцией и
 * наследуется от класса Actor.
 * 
 * Интерфейс iActorBehaviour определяет методы для управления заказами клиента,
 * а интерфейс iMarketBehaviour определяет методы для работы магазина и управления
 * клиентами. Интерфейс iQueueBehaviour определяет методы для управления очередью
 * и обработки заказов.
 * 
 * Классы и методы:
 * - Main: Главный класс программы, который запускает моделирование работы магазина.
 * - Market: Класс, представляющий магазин и реализующий методы для работы с клиентами.
 * - Actor: Абстрактный класс, представляющий клиента и реализующий методы управления заказами.
 * - OrdinaryClient: Класс, представляющий обычного клиента.
 * - SpecialClient: Класс, представляющий клиента со специальным статусом.
 * - PensionerClient: Класс, представляющий пенсионера-клиента.
 * - TaxService: Класс, представляющий службу налоговой.
 * - PromotionalClient: Класс, представляющий клиента с акцией.
 * - iActorBehaviour: Интерфейс, определяющий методы для управления заказами клиента.
 * - iMarketBehaviour: Интерфейс, определяющий методы для работы магазина и управления клиентами.
 * - iQueueBehaviour: Интерфейс, определяющий методы для управления очередью и обработки заказов.
 * - iReturnOrder: Интерфейс, определяющий метод возврата заказа.
 * 
 * Автор: Рябков Сергей
 * Дата: 03.07.2023 года.
 */
package Java_DZ;

import Java_DZ.dz_08.Classes.Market;
import Java_DZ.dz_08.Classes.OrdinaryClient;
import Java_DZ.dz_08.Classes.PensionerClient;
import Java_DZ.dz_08.Classes.SpecialClient;
import Java_DZ.dz_08.Classes.TaxService;
import Java_DZ.dz_08.Interfaces.iActorBehaviuor;


/**
 * Этот класс содержит метод `main`, который является точкой входа в программу.
 * Он создает экземпляр магазина, различных типов клиентов и налоговую службу.
 * Затем добавляет клиентов в магазин и обновляет состояние магазина.
 */
public class main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     * @throws Exception исключение, возникающее при выполнении программы
     */
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident", 1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay", 1111);
        iActorBehaviuor tax = new TaxService();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.update();
    }
}
