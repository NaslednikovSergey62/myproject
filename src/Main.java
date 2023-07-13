public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 7, 12, 17, 345};

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
