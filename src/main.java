import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for (int i=0;i<3;i++){
                    for (int j=0;j<6;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for(int i=0; i<6; i++) {
                    for (int j = 0; j < i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i=0;i<5;i++){
                    for (int j=i;j<4;j++){
                        System.out.print(" ");
                    }

                    for (int k = 0; k<=2*i;k++){
                        System.out.print("*");
                    }

                    System.out.println("");
                }
                break;
            case 4:
                break;
        }
    }
}
