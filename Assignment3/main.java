public class Main {
    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Student Information");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchByPRN();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    updateStudent();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }

    static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN: ");
        int prn = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Date of Birth: ");
        String dob = scanner.next();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(prn, name, dob, marks);
        students[count++] = student;
        System.out.println("Student added successfully!");
    }

    static void displayAllStudents() {
        if (count == 0) {
            System.out.println("No students added yet.");
            return;
        }
        System.out.println("All Students:");
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
        }
    }

    static void searchByPRN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN to search: ");
        int prn = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn() == prn) {
                System.out.println("Student found:");
                students[i].display();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    static void searchByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name to search: ");
        String name = scanner.next();

        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Student found:");
                students[i].display();
                return;
            }
        }
        System.out.println("Student with name " + name + " not found.");
    }

    static void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN to update: ");
        int prn = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn() == prn) {
                System.out.println("Student found. Enter new information:");
                System.out.print("Enter Name: ");
                String name = scanner.next();
                System.out.print("Enter Date of Birth: ");
                String dob = scanner.next();
                System.out.print("Enter Marks: ");
                double marks = scanner.nextDouble();

                students[i] = new Student(prn, name, dob, marks);
                System.out.println("Student information updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN to delete: ");
        int prn = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].getPrn() == prn) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                System.out.println("Student with PRN " + prn + " deleted successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}