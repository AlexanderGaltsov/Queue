import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    // Метод который выводит список клиентов
    public static List<Person> generateClients() {
        for (Person client : personList) {
            System.out.println(client);
        }
        System.out.println();
        System.out.println();
        return personList;
    }

    //  Создание коллекции
    public static List<Person> personList = new LinkedList<>();

    //  Создание очереди
    public static Queue<Person> personQueue = new LinkedList<>();


    public static void main(String[] args) {

        // Создание новых объектов
        Person person = new Person("Алексей", "Семенов", 5);
        Person person1 = new Person("Семен", "Фомин", 3);
        Person person2 = new Person("Олга", "Суворина", 8);
        Person person3 = new Person("Павел", "Воронов", 4);
        Person person4 = new Person("Любовь", "Зенина", 6);

        // Добовление новых объектов в коллекцию
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        // Вызов метода для вывода списка клиентов
        generateClients();

        // Передача из коллекции в очередь
        personQueue.addAll(personList);

        // Цикл проверки очереди пока она неопустела
        while (!personQueue.isEmpty()) {
            Person vacationer = personQueue.poll();// Присвоение переменной vacationer последовательно значений из очереди
            vacationer.pickTicket();// Метод в котором отнимается один билет
            if (Person.ticketsLeft > 0) {//Условие, что билетов осталось не меньше нуля
                System.out.println(vacationer + " " + "прокатился на атракционе");//Вывод переменной
                System.out.println();//Пустая строка в выводе
                personQueue.add(vacationer);//Если условие верно, то возвращается значение переменной в конец очереди
            }
        }

    }
}
