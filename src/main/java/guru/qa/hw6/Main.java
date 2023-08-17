package guru.qa.hw6;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных
        byte varByte ;          //8 бит от -128 до 127
        short varShort = 0;     //16 бит от -32768 до 32767
        int varInt = 0;         //32 бит от -2147483648 до 2147483647
        long varLong = 0L;      //64 бит от -9223372036854775808L до 9223372036854775807L
        char varChar = 0;
        float varFloat = 0.0F;  //32 бит от 1.4e-45f до 3.4e+38f
        double varDouble = 0.0; //64 бит от 4.9e-324 до 1.7e+308

        byte a = Byte.MAX_VALUE;
        byte b = 1;
        System.out.println("Перевдены в int 'a + b' = " + (a + b));
        byte byteResult = (byte) (a + b);
        System.out.println("Переполнение byte 'a + b' = " + byteResult);
        int c = 23;
        int d = 5;
        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));
        double e = 5.0;
        System.out.println("c / e = " + (c / e));
        System.out.println("(c / e) * e = " + ((c / e) * e));
        long f = Long.MAX_VALUE;
        long g = 1;
        System.out.println("Переполнение long f + g =" + (f + g));
        int h = 100;
        String i = "1";
        System.out.println("h + i = " + (h + i));
        System.out.println("------------------------------");

        int numberOne = 10;
        System.out.println("numberOne = " + numberOne++);
        System.out.println("numberOne = " + numberOne * 2);

        int numberTwo = 10;
        System.out.println("numberOne = " + ++numberTwo);
        System.out.println("numberOne = " + numberTwo * 2);

        int numberA = 1;
        int numberB = 1;

        String s = numberA++ == ++numberB ? "равно" : "инкременты...";
        System.out.println(s);


    }


}
