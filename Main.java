import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.addStudent();
                case 2 -> service.viewStudents();
                case 3 -> service.updateStudent();
                case 4 -> service.deleteStudent();
                case 5 -> service.searchStudent();
                case 6 -> {
                    System.out.println("Exiting System...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
