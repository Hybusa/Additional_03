public class Main {
    public static void main(String[] args)
    {


        //First task

      /*
        Напишите программу, которая выводит в консоль 5 кратных 4 чисел начиная от 1000 (включительно).
      */

        System.out.println("Задание 1.");

        int a1 = 1000;
        int q1 = 5;
        while (q1 != 0)
        {
            if (a1%4==0)
            {
                System.out.println(a1);
                q1--;
            }
            a1++;
        }
        System.out.println(System.lineSeparator());

        //Задание 2
        /*
        Напишите программу, которая выводит в консоль первые 10 элементов последовательности 1 3 5 7 9...
        */

        System.out.println("Задание 2.");

        int a2 = 1;
        for (int i2=0; i2<10; i2++)
        {
            System.out.println(a2);
            a2+=2;
        }

        System.out.println(System.lineSeparator());



        //Задание 3
        /*
        Напишите программу, которая выводит в консоль все неотрицательные
        элементы последовательности 90 85 80 75 70 65 60 ….
        */
        System.out.println("Задание 3.");

        int a3 = 90;
        while (a3 >= 0)
        {
            System.out.println(a3);
            a3-=5;
        }

        System.out.println(System.lineSeparator());


        //Задание 4
        /*
         Напишите программу, которая выводит в консоль первые 10 элементов
         последовательности 2 4 8 16 32 64 128 ….
        */
        System.out.println("Задание 4.");

        int a4 = 2;
        for (int i=0; i<10; i++)
        {
            System.out.println(a4);
            a4*=2;
        }

        System.out.println(System.lineSeparator());


        //Задание 5
        /*
         Напишите программу, которая выводит даты всех выходных дней месяца при условии,
         что 1ое число является субботой.
        */
        System.out.println("Задание 4.");

        for (int i = 1; i <= 31; i++)
        {
            System.out.println(i);
            i++;
            System.out.println(i);
            i+=5;
        }

        System.out.println(System.lineSeparator());


        //Задание 6
        /*
        В городе Туле проезд в трамвае осуществляется по бумажным отрывным билетам.
        Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами
        от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
        номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576.
        Напишите программу, которая выводит в консоль количество счастливых билетов в рулоне от 000001 до 999999
        */

        System.out.println("Задание 5.");

        int amount =0;
        for (int i = 1; i <= 999999;i++)
        {
          int firstP6 = i/1000;
          int secondP6 = i%1000;

          if(calc(firstP6) == calc(secondP6))
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