public class Person {


    protected String name;   //Имя
    protected String surname;  //Фамилия
    protected int numberTickets;  //Количество билетов
    public int ticketsLeft;  //Количество оставшихся билетов

    //Конструктор клиента
    public Person(String name, String surname, int numberTickets) {
        this.name = name;
        this.surname = surname;
        this.numberTickets = numberTickets;
    }

    // Возвращает введенное имя
    public String getName() {
        return name;
    }

    //Возвращает введенную фамилию
    public String getSurname() {
        return surname;
    }

    //Возвращает введеное количество билетов
    public int getNumberTickets() {
        return numberTickets;
    }

    //Метод ту стринг  для вывода списка клиентов через метод generateClients()
    public String toString() {
        return "Клиент " + getName() + " " + getSurname() + " " + "количество билетов " + getNumberTickets();
    }

    //Метод отнимает один билет
    public int pickTicket() {
        ticketsLeft = numberTickets--;
        return ticketsLeft;
    }

}
