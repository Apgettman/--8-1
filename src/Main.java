public class Main {
    public static void main(String[] args) {
        // ДЗ-8 Массивы Часть 1
        // Задача 1
        int[] weights = new int[12];
        weights[1] = 1;
        weights[2] = 2;
        weights[3] = 3;
        weights[4] = 4;
        weights[5] = 5;
        weights[6] = 6;
        weights[7] = 7;
        weights[8] = 8;
        weights[9] = 9;
        weights[10] = 10;
        weights[11] = 11;
        System.out.print(weights[1] + ", ");
        System.out.print(weights[2] + ", ");
        System.out.print(weights[3] + "!");

        // Задача 2
        double[] weight = {1.57, 7.654, 9.986};
        System.out.println();
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[2] + "!");
        System.out.println();
        // Задача 3
        System.out.print(weights[3] + ", ");
        System.out.print(weights[2] + ", ");
        System.out.print(weights[1] + "!");
        System.out.println();
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[0] + "!");
        System.out.println();

        // Задача 4

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i] + 1;
                System.out.print(weights[i]);
            }
        }
    }
}


