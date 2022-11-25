import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Phone[] phones = new Phone[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter parameters of phone: ");
            int number = scanner.nextInt();
            String model = scanner1.nextLine();
            double weight = scanner2.nextDouble();
            Phone phone = new Phone(number, model, weight);
            phones[i] = phone;
        }

        System.out.println("Enter parameters of the fourth phone: ");
        int number4 = scanner.nextInt();
        String model4 = scanner1.nextLine();
        Phone phone4 = new Phone(number4, model4);

        System.out.println("Enter 3 names: ");
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            String name = scanner1.nextLine();
            names[i] = name;
        }

        for (int i = 0; i < 3; i++) {
            phones[i].receiveCall(names[i], phones[i].getNumber());
        }

        long[] numbers = new long[4];
        for (int i = 0; i < 3; i++) {
            long number = phones[i].getNumber();
            numbers[i] = number;
        }
        numbers[3] = phone4.getNumber();

        phone4.sendMessage(numbers);
    }
}