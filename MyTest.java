public class MyTest {
    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        int remnant;

        for (int i = 0; i < array.length; i++) {

            remnant = array[i] % 2;

            array[i] = ((int)(Math.random() * 100));
            if (remnant == 0)
            System.out.println(" Числоп " + array[i] + " чётное");
        }
    }
}

