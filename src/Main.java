import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


    // Метод который выводит список клиентов
    public static List<Person> generateClients() {
        for (Person client : personList) {
            System.out.println(client);
        }
        return personList;
    }

    //  Создание коллекции
    public static List<Person> personList = new LinkedList<>();


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

    }


}
