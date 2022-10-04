public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        for (int i2 = 10; i2 > 1; i2--){
            System.out.println(i2);
        }

        //Задача 3
        for (int i3 = 0; i3 < 17; i3 = i3 + 2) {
            System.out.println(i3);
        }

        //Задача 4
        for (int i4 = 10; i4 > -10; i4 = i4 - 2){
            System.out.println(i4);
        }

        //Задача 5
        for (int i5 = 1904; i5 < 2096; i5 = i5 + 4){
            System.out.println(i5 + " год является високосным.");
        }

        //Задача 6
        for (int i6 = 7; i6 < 99; i6 = i6 + 7){
            System.out.println(i6);
        }

        //Задача 7
        for (int i7 = 1; i7 < 513; i7 = i7 * 2){
            System.out.println(i7);
        }

        //Задача 8
        int banks = 0;
        for (int i8 = 1; i8 < 13; i8++){
            banks = banks + 29000;
            System.out.println("Месяц " + i8 + ", cумма накоплений равна " + banks + " рублей.");
        }

        //Задача 9
        double banks2 = 0;
        for ( int i9 = 1; i9 < 13; i9++){
            banks2 = (banks2 + 29000 * 0.01);
            System.out.println("Месяц " + i9 + ", cумма накоплений равна " + banks2 + " рублей.");
        }
    }
}