package Control;

import Entity.Admin;

import java.util.Scanner;

public class AdminUI {
    /**
     * An object of an admin.
     */
    private Admin admin;
    //Course course;

    /**
     * Creates the AdminUI.
     *
     * @param admin is an object of admin.
     */
    public AdminUI(Admin admin) {
        this.admin = admin;
    }

    /**
     * A method that allows an admin to select what to do, of the 8.
     */
    public void adminMenu() {
        Scanner sc = new Scanner(System.in);
        AdminControl acontrol = new AdminControl(admin);
        int choice = 0;
        do {
            System.out.println("1. Edit student access periods");
            System.out.println("2. Add a student");
            System.out.println("3. Add a course");
            System.out.println("4. Update a course");
            System.out.println("5. Check available slot for an index number");
            System.out.println("6. Print student list by course");
            System.out.println("7. Print student list by index");
            System.out.println("8. Logout");
            System.out.println("Enter your choice here: ");

            try {
                String dummy = sc.next();
                choice = Integer.parseInt(dummy);
            } catch (Exception e) {
                System.out.println("Input should be an integer!");
                continue;
            }


            switch (choice) {
                case 1:
                    acontrol.editStudentAccessPeriod();
                    break;

                case 2:
                    acontrol.addStudent();
                    break;

                case 3:
                    acontrol.addCourse();
                    break;

                case 4:
                    acontrol.updateCourse();
                    break;

                case 5:
                    acontrol.checkAvailableSlots();
                    break;

                case 6:
                    acontrol.printStudentByCourse();
                    break;

                case 7:
                    acontrol.printStudentByIndex();
                    break;

                case 8:
                    //Serialise here
                    System.out.println("Logging out...");
                    acontrol.saveData();
                    break;

                default:
                    System.out.println("Invalid choice. Choices are between 1 to 7.");
            }
        } while (choice != 8);
    }
}

