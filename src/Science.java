import java.util.Scanner;

public class Science extends Exams{

    String Questions;
    String Answers;
    int marks = 0;

    public Science(){ }

    public Science(String Questions, String Answers){
        this.Questions = Questions;
        this.Answers = Answers;
    }

    /*String q12 = "The tree has a branch filled with green _____.\n"
            + "(a) Branches\n(b) Leaves\n(c) Stem\n(d) Trunk\n";
    String q22 = "The two holes of the nose are called?\n"
            + "(a) Eyelids\n(b) Nostrils\n(c) Nose\n(d) Hairs\n";
    String q32 = "Legs have feet and arms have ___.\n"
            + "(a) Pelvis\n(b) Hands\n(c) Ankles\n(d) Skull\n";

    String q13 = "Which animal lays eggs?\n"
            + "(a) Dog\n(b) Cat\n(c) Duck\n(d) Sheep\n";
    String q23 = "All animals need food, air, and ____ to survive.\n"
            + "(a) House\n(b) Water\n(c) Chocolate\n(d) Fruit\n";
    String q33 = "What is Earth’s only natural satellite?\n"
            + "(a) Moon\n(b) Sun\n(c) Stars\n(d) Venus\n";*/

    ScienceQuestions SQ = new ScienceQuestions();
    private void TakeTest(Science [] science){
        for(int i = 0; i<science.length; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Note: Mark your answer as a,b,c or d.");
            System.out.println("\n\n"+science[i].Questions);
            String ans = sc.nextLine();
            if(ans.equals("a")  || ans.equals("b") || ans.equals("c") || ans.equals("d"))
            {
                if (ans.equals(science[i].Answers)) {
                    marks++;
                }
            }else
                System.out.println("Your Answer is marked wrong as it is not a,b,c or d.");
            /*if (ans.equals(science[i].Answers)) {
                marks++;
            }*/
        }
        System.out.println("\nYou got "+marks+" / "+science.length);
    }

    @Override
    public void TakeClass2Quiz() {
        Science [] test = {
                new Science(SQ.q12,"b"),
                new Science(SQ.q22,"b"),
                new Science(SQ.q32,"b")
        };
        TakeTest(test);
    }

    @Override
    public void TakeClass3Quiz() {
        Science [] test = {
                new Science(SQ.q13,"c"),
                new Science(SQ.q23,"b"),
                new Science(SQ.q33,"a")
        };
        TakeTest(test);
    }
}
