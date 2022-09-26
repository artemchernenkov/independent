public class StackOver {
    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 100));
            System.out.println(array[i]);
        }
    }
}
