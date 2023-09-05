import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String again;
        Scanner sc = new Scanner(System.in);
        int mainmenuchoice;
        int subject;
        Science s1 = new Science();
        Maths m1 = new Maths();
        Student student = new Student();
        ShowResult result = new ShowResult();
        /*Invigilator [] invigilators = {
                new Invigilator("Umer",27,"Maths"),
                new Invigilator("Aftab",25,"Science"),
                new Invigilator("Rizwan",30,"Maths and Science")
        };*/
        Invigilator invigilators1 = new Invigilator();
        Invigilator invigilators2 = new Invigilator();
        Invigilator invigilators3 = new Invigilator();

        invigilators1.setName("Umer");
        invigilators1.setAge(27);
        invigilators1.setSubject("Maths");

        invigilators1.setName("Aftab");
        invigilators1.setAge(25);
        invigilators1.setSubject("Science");

        invigilators1.setName("Rizwan");
        invigilators1.setAge(30);
        invigilators1.setSubject("Maths and Science");

        System.out.println("\t\t\t Welcome to Class 2 and Class 3 Final Exams of Maths and Science\n\n\n");
        System.out.println("Please Enter the following details: ");
        System.out.println("\nEnter Student Name: ");
        student.setName(sc.nextLine());
        System.out.println("\nEnter Age: \nNote Age must be in numbers.");
        try {
            student.setAge(sc.nextInt());
        } catch (InputMismatchException ex) {
            System.out.println("Age must be in Number");
            sc.nextLine();
            student.setAge(sc.nextInt());
        }
        System.out.println("\n\nWhich class you are from?\n1. Class 2\n2. Class 3");
        System.out.println("\nPlease Select corresponding choice according to your Grade: ");
        student.setStandard(sc.nextInt()+1);
        System.out.println("Following subjects are displayed below.");
        System.out.println("1. Maths(Available)\n2. Science(Available)\n3. Urdu(Not Available)\n4. English(Not Available)\n5. Pakistan Studies(Not Available\n");
        System.out.println("\n\nWhich Subject test you want to attempt?\n1. Maths\n2. Science\n3. Both");
        System.out.println("\nPlease Select corresponding choice according to your Grade: ");
        subject = sc.nextInt();
        do{
            System.out.println("Menu");
            System.out.println("1. Give Test.\n2. Show Result.\n3.Exit");
                mainmenuchoice = sc.nextInt();
            switch (mainmenuchoice) {
                case 1:
                    if (student.getStandard() == 2 && subject == 1) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators1.getName());
                        m1.TakeClass2Quiz();
                    } else if (student.getStandard() == 2 && subject == 2) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators2.getName());
                        s1.TakeClass2Quiz();
                    } else if (student.getStandard() == 2 && subject == 3) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators3.getName());
                        m1.TakeClass2Quiz();
                        s1.TakeClass2Quiz();
                    } else if (student.getStandard() == 3 && subject == 1) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators1.getName());
                        m1.TakeClass3Quiz();
                    } else if (student.getStandard() == 3 && subject == 2) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators2.getName());
                        s1.TakeClass3Quiz();
                    } else if (student.getStandard() == 3 && subject == 3) {
                        System.out.println("\n\nThe Invigilator who can check you systems is " + invigilators3.getName());
                        m1.TakeClass3Quiz();
                        s1.TakeClass3Quiz();
                    }
                    break;
                case 2:
                    if (student.getStandard() == 2 && subject == 1) {
                        result.ShowMathsResult(m1.marks, student.getName(), student.getStandard());
                    } else if (student.getStandard() == 2 && subject == 2) {
                        result.ShowScienceResult(s1.marks, student.getName(), student.getStandard());
                    } else if (student.getStandard() == 2 && subject == 3) {
                        result.ShowMathsResult(m1.marks, student.getName(), student.getStandard());
                        result.ShowScienceResult(s1.marks, student.getName(), student.getStandard());
                    } else if (student.getStandard() == 3 && subject == 1) {
                        result.ShowMathsResult(m1.marks, student.getName(), student.getStandard());
                    } else if (student.getStandard() == 3 && subject == 2) {
                        result.ShowScienceResult(s1.marks, student.getName(), student.getStandard());
                    } else if (student.getStandard() == 3 && subject == 3) {
                        result.ShowMathsResult(m1.marks, student.getName(), student.getStandard());
                        result.ShowScienceResult(s1.marks, student.getName(), student.getStandard());
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("The choice is either 1,2 or 3.");
            }
            System.out.println("\n\nDo you want to continue?\nPress Y to display menu and N to exit.");
            sc.nextLine();
            again = sc.nextLine();
        }while (again.equals("Y") || again.equals("y"));
    }
}