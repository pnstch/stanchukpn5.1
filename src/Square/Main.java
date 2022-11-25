package Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите количество фигур:");
        int N = scanner1.nextInt();
        Area[] figure = new Area[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Введите номер фигуры: ");
            System.out.println();
            System.out.println("1. Круг");
            System.out.println("2. Прямоугольник");
            System.out.println("3. Квадрат");
            System.out.println("4. Треугольник");
            double user_input = scanner.nextDouble();
            if (user_input == 1) {
                System.out.println("Введите радиус круга");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                figure[i] = circle;
            } else if (user_input == 2) {
                System.out.println("Введите 2 стороны прямоугольника");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(side1, side2);
                figure[i] = rectangle;
            } else if (user_input == 3) {
                System.out.println("Введите сторону квадрата");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                figure[i] = square;
            } else if (user_input == 4) {
                System.out.println("Введите 3 стороны треугольника");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                figure[i] = triangle;
            } else
                System.out.println("Ошибка");
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Площадь " + (i + 1) + " фигуры: " + figure[i].calculateArea());
        }
    }
}