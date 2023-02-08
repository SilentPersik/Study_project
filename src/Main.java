public class Main {
    public static void main(String[] args) {
// Базовый метод, отсюда вызываются дочерние.
        severalvalue();
        System.out.println();
        matrix();
        System.out.println();
        matrixnonsquare();
        System.out.println();
        basicmath();
        System.out.println();
        modulus();
    }

    static void severalvalue() {
        System.out.println("1. Поиск среднего значения из массива.");
        double nums[] = {10.5, 11.6, 12.3, 14.1, 13.4};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
            result = result + nums[i];
        System.out.println("Среднее значение равно " + result / 5);
    }

    static void matrix() {
        System.out.println("2. Вывод на печать двумерного массива.");
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }

    static void matrixnonsquare() {
        System.out.println("3. Вывод на печать неравномерного массива.");
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }

    static void basicmath() {
        System.out.println("4. Основные арифметические операции." + "\n");
        System.out.println("Aрифметические операции над целочисленными значениями." +
                "\n" + "Целочисленная арифметика:");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\n" +
                "Арифметические операции над значениями типа double." +
                "\n" + "Арифметика с плавающей точкой:");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }

    static void modulus() {
        System.out.println("5. Деление по модулю (остаток от деления).");
        int x = 42;
        double y = 42.6;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }

    static void next() {

    }
} // Закрывающая фигурная скобка базового класса Main.