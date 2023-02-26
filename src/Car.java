import java.util.Scanner;

/**
 * 1) Напишите класс Car.
 * В классе должна храниться следующая информация:
 * название автомобиля - model;
 * год выпуска - year;
 * стоимость - price;
 * цвет - color;
 * объем двигателя - power.
 *
 * 2) Доработайте класс Car.
 * Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей
 * объекта класса model , power и year.
 *
 * 3) Доработайте класс Car.
 * В классе должна храниться следующая информация:
 * Свойство - которое говорит заведен авто или нет
 * Метод - запуска автомобиля
 * Метод - остановки автомобиля
 * Метод дороги - при вызове, в качестве аргумента передаем место назначения
 * И если авто заведён - выводим, что мы на такой-то авто едем место назначения
 * Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
 *
 * ДЗ
 * Доработайте программу в свободном стиле.
 * Можно сравнить 2 автомобиля между собой
 * Или пусть авто заедет за фруктами :-)
 * Добавьте несколько произвольных методов и свойств
 *
 * ДОП: Сделать гонки:
 * - задаём растояние
 * - едут до финиша.
 * Сказать кто победит.
 */
public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status = false;
    private int way;

    Car(String model, int year, double price, String color, int power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;

    }

    public void getInfo() {
        System.out.println(model + "," + year + " лет, " + price + " т.р. " + color + ", " + power + "л.с.");
    }

    public void start() {
        this.status = true;
        System.out.println("Атомобиль " + model + " заведён");
    }
    public void stop() {
        this.status = false;
        System.out.println("Автомобиль " + model + " остановлен");
    }

    public void road(String address) {
        if (status == false) {
            System.out.println("Заведите автомобиль " + model + " , прежде чем начать ехать");
        }
        else {
            System.out.println("Мы едем по адресу: " + address);
        }
    }
    public String getModel() {
        return model;
    }
    public int getWay() {
        return  way;
    }
    public void setWay(int way){
        this.way = this.way + way;
    }


}