public class Main {
    public static void main(String[] args) {

        int number = 25;


        if (number % 3 == 0) {
            System.out.println("Tick");
        }
        if (number % 5 == 0) {
            System.out.println("Tock");
        }
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("Tick Tock");
        }

    }
}

