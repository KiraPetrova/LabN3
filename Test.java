import RESTORAAN.Restourant;



public class laba3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        out.print("Введите количество столов: "); // Ввод количества столов
        int n = in.nextInt();


        int[] stoly = new int[n];
        out.println("Введите вместимость каждого стола:");
        for (int i = 0; i < n; i++) {
            stoly[i] = in.nextInt();
        }

        // Создание объекта ресторана
        Restourant restaurant = new Restourant(stoly);

        out.println();







        // Пример использования методов с проверкой выполнения

        // Метод посадки одного гостя за стол с номером 1
        System.out.println("              Пример посадки одного гостя ");
        restaurant.seatOne(1);  // Попытка посадить гостя за стол 1
        restaurant.seatOne(100); // Попытка посадить гостя за несуществующий стол

        // Метод посадки компании из 3 человек за стол 2
        System.out.println("              Пример посадки компании ");
        restaurant.seatCompany(2, 3);  // Попытка посадить компанию из 3 человек за стол 2
        restaurant.seatCompany(1, 100);  // Попытка посадить компанию из 100 человек за стол 1 (мест недостаточно)

        // Метод посадки компании за первый подходящий стол с вместимостью >= k
        System.out.println("              Пример посадки компании за первый подходящий стол ");
        restaurant.seatCompanyFirstStol(4); // Попытка посадить компанию из 4 человек за первый подходящий стол
        restaurant.seatCompanyFirstStol(100); // Попытка посадить компанию из 100 человек (неподходящий стол)

        // Метод посадки компании за самый выгодный стол (с минимальными лишними местами)
        System.out.println("              Пример посадки компании за самый выгодный стол ");
        restaurant.seatCompanyVigodniyStol(5); // Попытка посадить компанию из 5 человек за самый выгодный стол
        restaurant.seatCompanyVigodniyStol(100); // Попытка посадить компанию из 100 человек (нет подходящих столов)

        // Метод освобождения стола
        System.out.println("              Пример освобождения стола ");
        restaurant.osvobozhdenieStola(1);  // Освободить стол 1
        restaurant.osvobozhdenieStola(20); // Попытка освободить несуществующий стол

        // Метод посадки компании за несколько соседних столов
        System.out.println("              Пример посадки компании за несколько столов ");
        restaurant.seatCompanyNaNeskolkoStolov(7);  // Попытка посадить компанию за несколько столов
        restaurant.seatCompanyNaNeskolkoStolov(200); // Попытка посадить компанию за несколько столов (мало столов)

        // Метод посадки компании за несколько столов с минимальными лишними местами
        System.out.println("              Пример посадки компании за несколько столов с минимальными лишними местами ");
        restaurant.seatCompanyVigodniyNeskolkoStolov(7);  // Попытка посадить компанию за несколько столов с минимальными лишними местами
        restaurant.seatCompanyVigodniyNeskolkoStolov(200); // Попытка посадить компанию за несколько столов с минимальными лишними местами (мало столов)
    }
}
