import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String developerSurname = "Gubskiy";
        Date dateReceived = new Date();

        Thread.sleep(20000);


        Date dateSubmitted = new Date(); // Получение текущей даты и времени

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}