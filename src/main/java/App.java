public class App {
    public static void main(String[] args) {
        System.out.println(Hello,Welcome to my Caesar-cipher Website.);
        while (true){
            System.out.println(Select "e" for encryption or "d" for decryption);
            Scanner input= new Scanner(Scanner.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("e")){
                System.out.println("Input The Text For Encryption");
                String plainText = input.nextLine().toLowerCase();
                System.out.println("Input The Random Value");
                int none = input.nextInt();
                App message = new App(plainText, none);

            }
        }
    }
}
