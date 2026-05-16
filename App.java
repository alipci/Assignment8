import java.util.Scanner;

/**
 * An interactive main menu.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Shape Draw with Turtle");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Star");
            System.out.println("0. Quit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            Shape shape = null;
            switch (choice) {
                case 1: {
                    System.out.print("x: ");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("y: ");
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    shape = new Triangle(x, y, color);
                    break;
                }
                case 2: {
                    System.out.print("x: ");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("y: ");
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Width: ");
                    int width = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Height: ");
                    int height = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    shape = new Rectangle(x, y, width, height, color);
                    Rectangle rect = (Rectangle) shape;
                    System.out.println("Area: " + rect.getArea());
                    break;
                }
                case 3: {
                    System.out.print("x: ");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("y: ");
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    shape = new Circle(x, y);
                    break;
                }
                case 4: {
                    System.out.print("x: ");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("y: ");
                    int y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    shape = new Star(x, y, color);
                    break;
                }
                case 0:
                    System.out.println("Exit Program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (shape != null) {
                shape.draw();
                System.out.println("Shape Drew: " + shape);
            }
        } while (choice != 0);
    }
}
