public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int wanted = 7;
        boolean checker = false;

        for (int number:numbers){
            if (wanted == number){
                checker = true;
                break;
            }
        }

        /*OTHER WAY
        for (int i = 0; i < numbers.length; i++) {
            if (wanted == numbers[i]) {
                checker = true;
                break;
            }
        }*/

        if (checker){
            System.out.println("Number found.");
        }
        else{
            System.out.println("Number can't found.");
        }
    }
}