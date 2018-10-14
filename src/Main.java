import ru.valiullin.Print;
import ru.valiullin.Unique;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //TODO public boolean isUnique(Map<String, String> map);
    //Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
    //Для пустой мапы метод возвращает true.
    //Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
    //а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.

    public static void main(String[] args) {
        Map<String, String> exmpl1 = new HashMap<>(); // Заполянем хэш мап
        exmpl1.put("Вася","Иванов");
        exmpl1.put("Петр","Петров");
        exmpl1.put("Виктор","Сидоров");
        exmpl1.put("Сергей","Савельев");
        exmpl1.put("Вадим","Викторов");

        Map<String, String> exmpl2 = new HashMap<>(); // Заполянем хэш мап
        exmpl2.put("Вася","Иванов");
        exmpl2.put("Петр","Петров");
        exmpl2.put("Виктор","Иванов");
        exmpl2.put("Сергей","Савельев");
        exmpl2.put("Вадим","Петров");

        Unique unique = new Unique();                   // Создаем экземпялр класса юник
        boolean boolResult1 = unique.isUnique(exmpl1);   //Вызываем метод и передаем заполненные значения
        Print.Print(exmpl1, boolResult1);

        //System.out.println(exmpl1.toString());          //Печатаем хэш мапу
        //System.out.println(boolResult);                 //Печатаем результат сравнения

        System.out.println("=============");

        boolean boolResult2 = unique.isUnique(exmpl2);           //Вызываем метод и передаем заполненные значения
        Print.Print(exmpl2, boolResult2);
        //System.out.println(exmpl2.toString());          //Печатаем хэш мапу
        //System.out.println(boolResult);                 //Печатаем результат сравнения
    }
}
