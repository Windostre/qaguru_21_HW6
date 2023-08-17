package guru.qa.lecture;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        //булево
        boolean isNameDima = true;
        boolean isNameIvan = false;
        Boolean isNameWrapper = null;
        Boolean box = false;
        boolean unbox = box;
        // Целочисленные типы данных
        byte varByte = 0;       //8 бит от -128 до 127
        Byte varByteWrapper = null;;
        short varShort = 0;     //16 бит от -32768 до 32767
        Short varShortWrapper = 0;
        int varInt = 0;         //32 бит от -2147483648 до 2147483647
        Integer varIntWrapper = null;;
        long varLong = 0L;        //64 бит от -9223372036854775808L до 9223372036854775807L
        Long varLongWrapper = null;;
        char varChar = 'a' + 7;
        Character varCharWrapper = null;;
        //Плавающая точка
        float varFloat = 0.0F;  //32 бит от 1.4e-45f до 3.4e+38f
        Float varFloatWrapper = null;;
        double varDouble = 0.0; //64 бит от 4.9e-324 до 1.7e+308
        Double varDoubleWrapper = null;
        //Класс
        String varString = "Hello";

        class Human {
            int age;
            boolean isClever;
            char size;
        }

        System.out.println(varChar);

        //Oператоры
        //Арифметические + - * / % ++ --
        System.out.println(10 / 3);  //3
        System.out.println(10.0 / 3);  //3.3333333333333335
        System.out.println(10 % 3); //1
        int var = 10;
        var = var++; // сначала вернет 10, а потом прибавит 1
        var = ++var; // сначала прибавит 1 а потом вернет результат

        //Операторы сравнения < > <= >= != ==
        System.out.println(10 > 1); // true

        //Логические опареаторы &&(&) ||(|), !
        String name = "Dima";
        int age = 34;
        System.out.println(name.equals("Dima") && age == 34); //true
        System.out.println(name.equals("Ivan") && age == 34); //false
        System.out.println(name.equals("Ivan") || age == 34); //true

        //Оператор присвоения = += -= *=
        int year = 2000;
        age += 100; //2100

        //Оператор instanceof
        boolean isNameTypeString = name instanceof String;
        System.out.println(isNameTypeString);

        //Тернарый опреатор ?
        char sex = 'm';
        String childName = null;
        //# Вариант записи 1
        childName = sex == 'm' ? "Valera" : "Mariya";
        //# Вариант записи 2
        childName = sex == 'm'
                ? "Valera"
                : "Mariya";
        //# Вариант записи 3
        childName = (sex == 'm')
                ? "Valera"
                : "Mariya";

        if (sex == 'm') {
            childName = "Valera";
        } else {
            childName = "Mariya";
        }
    }
}