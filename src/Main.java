import java.util.*;

public class Main {

    public static void main(String[] args) {

        //  Создание очереди
        Queue<Person> personQueue = new LinkedList<>();

        //  Добавление людей в очередь
        List<Person> people = generateClients();
        for (Person client : people) {
            personQueue.offer(client);
        }

        // Цикл проверки очереди пока она неопустела
        while (!personQueue.isEmpty()) {
            Person person = personQueue.poll();
            person.pickTicket();// Метод в котором отнимается один билет
            if (person.ticketsLeft > 0) {//Условие, что билетов осталось не меньше нуля
                System.out.println(person + " " + "прокатился на атракционе");//Вывод переменной
                System.out.println();//Пустая строка в выводе
                personQueue.offer(person);//Если условие верно, то возвращается значение переменной в конец очереди
            }
        }

    }

    // Метод который выводит список клиентов
    public static List<Person> generateClients() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Алексей", "Семенов", 5));
        person.add(new Person("Семен", "Фомин", 3));
        person.add(new Person("Павел", "Воронов", 4));
        person.add(new Person("Любовь", "Зенина", 6));
        for (Person client : person) {
            System.out.println(client);
        }
        System.out.println();
        return person;
    }
}
