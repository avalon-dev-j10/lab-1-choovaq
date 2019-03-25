package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    public static void main(String args[]) {        
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        
        Passport ivanovPassport = new Passport(1425, "Иванов", "Иван", "Иванович", null, "01.01.2001", "02.02.2015", "ТП№1");
        Address ivanovAddress = new Address("Saint-Petersburg", "Nevsky", 12);
        Person ivanov = new Person("Ivanov", ivanovPassport, ivanovAddress);
        
        Passport smithPassport = new Passport(5241, "John", "Smith", null, "Edvard", "12.12.2012", null, null);
        Address smithAddress = new Address("Helsinki", "Central", 21);
        Person smith = new Person("Smith",smithPassport, smithAddress);
        
        String nameIvanov = ivanov.getFullName();
        System.out.println(nameIvanov);
        String nameSmith = smith.getFullName();
        System.out.println(nameSmith);
        String addressIvanov = ivanov.getAddress();
        System.out.println(addressIvanov);
        String addressSmith = smith.getAddress();
        System.out.println(addressSmith);

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
