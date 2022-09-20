public class Person {

    protected String name;   //Имя
    protected String surname;  //Фамилия
    protected int numberTickets;  //Количество билетов

    //Конструктор клиента
    public Person(String name, String surname, int numberTickets){
        this.name = name;
        this.surname = surname;
        this.numberTickets = numberTickets;
    }

    public String getName() {
        return name;
    } // Возвращает введенное имя

    public String getSurname() {
        return surname;
    }  //Возвращает введенную фамилию

    public int getNumberTickets() {
        return numberTickets;
    }  //Возвращает введеное количество билетов

    //Метод ту стринг  для вывода списка клиентов через метод generateClients()
    public String toString(){
        return "Клиент " + getName() + " " + getSurname() + " " + "количество билетов " + getNumberTickets();
    }

    public static void main(String[] args) {



    }


}
