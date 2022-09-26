public class Rand3 {
    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                count++;
        }
        System.out.println("Количество нечётных" + count);
    }
}
