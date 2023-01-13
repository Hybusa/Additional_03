public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {

        //First task

      /*
        Напишите программу, которая выводит в консоль 5 кратных 4 чисел начиная от 1000 (включительно).
      */

        System.out.println("Задание 1.");

        int a = 1000;
        int q = 5;
        while (q != 0) {
            if (a % 4 == 0) {
                System.out.println(a);
                q--;
            }
            a++;
        }
        System.out.println(System.lineSeparator());

    }

    public static void task2() {
        //Задание 2
        /*
        Напишите программу, которая выводит в консоль первые 10 элементов последовательности 1 3 5 7 9...
        */

        System.out.println("Задание 2.");

        int a = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a += 2;
        }

        System.out.println(System.lineSeparator());

    }

    public static void task3() {

        //Задание 3
        /*
        Напишите программу, которая выводит в консоль все неотрицательные
        элементы последовательности 90 85 80 75 70 65 60 ….
        */
        System.out.println("Задание 3.");

        int a = 90;
        while (a >= 0) {
            System.out.println(a);
            a -= 5;
        }

        System.out.println(System.lineSeparator());
    }


    public static void task4() {
        //Задание 4
        /*
         Напишите программу, которая выводит в консоль первые 10 элементов
         последовательности 2 4 8 16 32 64 128 ….
        */
        System.out.println("Задание 4.");

        int a = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a *= 2;
        }

        System.out.println(System.lineSeparator());
    }

    public static void task5() {
        //Задание 5
        /*
         Напишите программу, которая выводит даты всех выходных дней месяца при условии,
         что 1ое число является субботой.
        */
        System.out.println("Задание 4.");

        for (int i = 1; i <= 31; i++) {
            System.out.println(i);
            i++;
            System.out.println(i);
            i += 5;
        }

        System.out.println(System.lineSeparator());

    }

    public static void task6() {
        //Задание 6
        /*
        В городе Туле проезд в трамвае осуществляется по бумажным отрывным билетам.
        Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами
        от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
        номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
        Напишите программу, которая выводит в консоль количество счастливых билетов в рулоне от 000001 до 999999
        */

        System.out.println("Задание 5.");

        int amount = 0;
        for (int i = 1; i <= 999999; i++) {
            int firstP6 = i / 1000;
            int secondP6 = i % 1000;

            if (calc(firstP6) == calc(secondP6))
                amount++;

            // System.out.println(i);

        }

        System.out.println(amount);
        System.out.println(System.lineSeparator());
    }


    private static int calc (int numb)
    {
        int result;

        int numbA = numb/100;
        int numbB = (numb%100) / 10;
        int numbC = numb%10;

        result = numbA + numbB + numbC;

        return result;

    }
}