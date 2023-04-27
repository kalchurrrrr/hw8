import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"яблоко", "банан", "апельсин"};

        System.out.println("Целочисленный массив:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("Массив дробных чисел:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }

        System.out.println("Произвольный массив:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"яблоко", "банан", "апельсин"};

        System.out.print("Целочисленный массив: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i != intArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nМассив дробных чисел: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i != doubleArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nПроизвольный массив: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i != stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = new double[]{1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"яблоко", "банан", "апельсин"};

        System.out.print("Целочисленный массив в обратном порядке: ");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print("\nМассив дробных чисел в обратном порядке: ");
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.print("\nПроизвольный массив в обратном порядке: ");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}