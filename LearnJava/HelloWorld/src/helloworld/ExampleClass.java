package helloworld;

/*
* strictfp - нужен для четких расчетов
* abstract - нужен для создания безтельных методов, которые будут реализованы позже
*    - нельзя создать объект
* final - нельзя наследовать
* */
class ExampleClass {
    void method(){
        Car car = new Skoda();
        car.run();
    }
}

abstract class Car{
    int speed = 20;
    abstract void run ();
    void stop(){
        this.speed = 0;
    }
}
class Skoda extends Car{
    @Override
    void run() {
        speed = 0;
    }
}

final class myFinalClass{
    void method(){
        System.out.println("ok");
    }
}
