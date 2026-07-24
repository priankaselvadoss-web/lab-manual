import java.util.Scanner;

public class RegistrationForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("           STUDENT REGISTRATION FORM");
        System.out.println("----------------------------------------------------");

        System.out.print("USN          : ");
        String usn = sc.nextLine();

        System.out.print("Name         : ");
        String name = sc.nextLine();

        System.out.println("Branch     : [1] Computer Science  [2] Information Science");
        System.out.println("              [3] Electronics       [4] Mechanical");
        System.out.print("Select Branch (1-4): ");

        int branchChoice = Integer.parseInt(sc.nextLine());

        String branch;

        switch (branchChoice) {
            case 1:
                branch = "Computer Science";
                break;
            case 2:
                branch = "Information Science";
                break;
            case 3:
                branch = "Electronics";
                break;
            case 4:
                branch = "Mechanical";
                break;
            default:
                branch = "Not specified";
        }

        System.out.print("Gender       : (1) Male  (2) Female : ");
        int genderChoice = Integer.parseInt(sc.nextLine());

        String gender;

        if (genderChoice == 1) {
            gender = "Male";
        } else if (genderChoice == 2) {
            gender = "Female";
        } else {
            gender = "Not specified";
        }

        System.out.print("Skills       : Java? (y/n) : ");
        boolean javaSkill = sc.nextLine().trim().equalsIgnoreCase("y");

        System.out.print("               Python? (y/n) : ");
        boolean pythonSkill = sc.nextLine().trim().equalsIgnoreCase("y");

        StringBuilder skills = new StringBuilder();

        if (javaSkill) {
            skills.append("Java ");
        }

        if (pythonSkill) {
            skills.append("Python ");
        }

        if (skills.length() == 0) {
            skills.append("None");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Student Details");
        System.out.println("----------------------------------------------------");
        System.out.println("USN     : " + usn);
        System.out.println("Name    : " + name);
        System.out.println("Branch  : " + branch);
        System.out.println("Gender  : " + gender);
        System.out.println("Skills  : " + skills.toString().trim());
        System.out.println("----------------------------------------------------");

        sc.close();
    }
}
