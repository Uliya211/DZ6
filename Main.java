/*Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
        переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных
        класса - number, model.
        Добавить конструктор без параметров. */

public class Main {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.setNumber("89130604846");
        p.setModel("S1310");
        p.setWeight(120);
        p.receiveCall("Лера");
        p.info();
        System.out.println(p.getNumber());

        Phone p1=new Phone();
        p1.setNumber("89201890000");
        p1.setModel("KT0110");
        p1.setWeight(118);
        p1.receiveCall("Витя");
        p1.info();
        System.out.println(p1.getNumber());

        Phone p2=new Phone();
        p2.setNumber("89237395555");
        p2.setModel("Y100");
        p2.setWeight(99);
        p2.receiveCall("Юлия");
        p2.info();
       System.out.println(p2.getNumber());
    }
}