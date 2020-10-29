package one;

public class Test {
    //Переменные
    /*
    * volatile - переменная для решения проблемы многопоточности
    * transient - не учавствует в сиреализации
    * statiс - в памяти будет выделено всего одно место
    *   - Поле пренаделжит классу и оно одно для всех объектов
    *   - Статичные свойста всегда получают по умолчанию значения
    * final - конечное состояние перменной (Надо боязательно задать значение или задать его в конструкторе )
     */
    final int test;
    public Test(){
        this.test = 0;
    }
}
