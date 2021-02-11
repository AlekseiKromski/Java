package interfaces;

/*
* Интерфейс нужен для описания какого-либо поведения
* По дефолту interface являются абстрактными
* Методы интерфейсов по дефолту абстрактыне
* Для расширений интерфейсов в классе, надо использовать implements
* Можно инмлементировать много интерфейсов и обязательно НАДО ПЕРЕОПРЕДЕЛИТЬ ВСЕ МЕТОДЫ
* Все поля и методы интерфейся по дефолту [ public static final ]
*
* */
abstract public interface FirstInterface extends OtherInterface{
    public static final int SOME_CONST = 5;
    abstract void methodInterface(int one);
}

interface OtherInterface{
    void method();
}

class Exmaple implements FirstInterface{
    @Override
    public void methodInterface(int one) {
        //this.SOME_CONST = 3; - WRONG
    }

    public void method(){
        FirstInterface.
    }
}