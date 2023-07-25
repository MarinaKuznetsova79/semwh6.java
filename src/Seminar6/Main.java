package Seminar6;

import Utils.Utils;

import java.util.HashSet;

public class Main {

//    Задание
//    Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//    Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//    Создайте метод
//        public boolean equals(Object o)
//    Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//    Создайте метод
//        public int hashCode()
//    который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//    Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

    public static void main(String[] args) {

        System.out.println("Класс без переопределенных методов equals() и hashCode()");
        HashSet<Cats> cats = new HashSet<>();
        cats.add(new Cats("Boris", "white", 3, gender.MALE));
        cats.add(new Cats("Pusichka", "black-brown", 2, gender.FEMALE));
        cats.add(new Cats("Vasya", "gray", 3, gender.MALE));
        cats.add(new Cats("Pusik", "white", 3, gender.MALE));

        System.out.println(cats);
        Utils.Divider('-', 50);
        System.out.println("Класс c переопределенными методами equals() и hashCode()");
        HashSet<CatAdvanced> cats2 = new HashSet<>();
        cats2.add(new CatsAdvanced("Boris", "white", 3, gender.MALE));
        cats2.add(new CatsAdvanced("Pusichka", "black-brown", 2, gender.FEMALE));
        cats2.add(new CatsAdvanced("Vasya", "gray", 3, gender.MALE));
        cats2.add(new CatsAdvanced("Pusik", "white", 3, gender.MALE));
        System.out.println(cats2);

    }
}
