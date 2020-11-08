package classes;

/*
* У класса может быть только Public или Default модификатор достпа
* В файле может быть только один публичный класс и его имя должно совпадать с именем файла
* Можно расширять классы с помощью extend.
* strictfp (Модификатор) - повышает более точный подсчет float значений
* abstract (Модификатор) - невозможно создать экземпляр класса. Описания какого-либо поведения
* final (Модификатор) - Невозможно наследовать класс. Невозможно переопределить поля или методы класса
* final и abstract нельзя использовать вместе
* */

abstract class Example1 {
    abstract void run();
    public void stop(){
        System.out.println("stopped");
    }
}

public class Example extends Example1 {

    @Override
    public void run() {
        System.out.println("started + 2s");
    }
}