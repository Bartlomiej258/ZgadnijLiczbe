import java.util.Scanner;

public class NumberFromUser {

    void numbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału [100, 200] podzielną przez 3");
        int number;
        do {
            number = scanner.nextInt();
            if (number < 100)
                System.out.println("Liczba jest mniejsza od 100");
            else if (number > 200)
                System.out.println("liczba jest większa od 200");
            else if (number % 3 != 0)
                System.out.println("Liczba nie jest podzielna przez 3");
        } while (number < 100 || number > 200 || number % 3 != 0);

        System.out.println("Liczba spełnijąca warunki to: " + number);


    }
}
