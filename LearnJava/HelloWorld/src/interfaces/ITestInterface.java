package interfaces;

/*
* public static final - дефолтное значение свойст (те они становятся константами)
* public abstract - дефолтное значение методов
* public abstract interface - дефолтное значение для интерфейсов
* */
public abstract interface ITestInterface extends IOtherInterface{
    public static final int SOME_VAR = 0; //by default
    public abstract void addTwo(); //by default
}

interface IOtherInterface{
    void method();
}

class Example implements ITestInterface{
    @Override
    public void addTwo() {

    }
    public void method() {

    }
}