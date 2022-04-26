import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        for (i=10; i >= 1; i --) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Задание 2
        int firstFriday = 1;
        for (i=firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, "+ i + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3

        LocalDate current_date = LocalDate.now();
        int currentYear = current_date.getYear();
        int startDate = currentYear - 200;
        int stopDate = currentYear + 100;
        for (i=0; i <= stopDate; i = i + 79) {
            if (i >= startDate) {
                System.out.println( i + " год");
            }
        }
    }
}