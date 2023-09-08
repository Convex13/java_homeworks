import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr_for(sc);
        arr_while(sc);
        arr_do(sc);
        print_args(args);
        harmonic_series();
        //System.out.println(fact(0));
        //
    }

    public static void arr_for(Scanner sc) {
        System.out.println("Массив через цикл for \nВведите размер:");
        int size = sc.nextInt();
        float sum = 0;
        int [] array = new int[size];
        System.out.println("По очереди введите каждый элемент массива");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum/size);
    }

    public static void arr_while(Scanner sc) {
        System.out.println("Массив через цикл while \nВведите размер:");
        int size = sc.nextInt();
        float sum = 0; int i = 0;
        int max = 0; int min = 0;
        int [] array = new int[size];
        System.out.println("По очереди введите каждый элемент массива");
        while(i < size){
            array[i] = sc.nextInt();
            if (array[i] > max){ max = array[i];}
            if (array[i] < min){ min = array[i];}
            sum += array[i];
            i++;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + sum/size);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число:" + min);
    }

    public static void arr_do(Scanner sc) {
        System.out.println("Массив через цикл do while \nВведите размер:");
        int size = sc.nextInt();
        float sum = 0; int i = 0;
        int max = 0; int min = 0;
        int [] array = new int[size];
        System.out.println("По очереди введите каждый элемент массива");
        do {
            array[i] = sc.nextInt();
            if (array[i] > max){ max = array[i];}
            if (array[i] < min){ min = array[i];}
            sum += array[i];
            i++;
        } while(i < size);
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + sum/size);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число:" + min);
    }

    public static void print_args(String[] args){
        for (String arg : args) System.out.println(arg);
    }

    public static void harmonic_series(){
        int n = 1;
        for (int i = 1; i < 11; i++){
            System.out.println(String.format("%.3f",1./i));

        }
    }

    public static int fact(int n){
        if (n == 0 || n == 1) return 1;
        else {
            int rez = 1;
            for (int i = 2; i <= n; i++) rez *= i;
            return rez;
        }
    }


}