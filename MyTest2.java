public class MyTest2 {

    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            for (int number : array) {
                int a = number % 2;
                if (a == 0) {
                    System.out.println(number + " является нечетным числом");
                }
            }
        }
    }
}

