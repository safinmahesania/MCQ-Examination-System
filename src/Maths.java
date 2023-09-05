import java.util.Scanner;

public class Maths extends Exams {

    String Questions;
    String Answers;
    int marks = 0;

    public Maths(){

    }

    public Maths(String Questions, String Answers){
        this.Questions = Questions;
        this.Answers = Answers;
    }

    MathsQuestions MQ = new MathsQuestions();

    /*String q12 = "What is 2 + 2 = ?\n"
            + "(a) 2\n(b) 3\n(c) 4\n(d) 5\n";
    String q22 = "What is 5 * 4 = ?\n"
            + "(a) 20\n(b) 15\n(c) 10\n(d) 25\n";
    String q32 = "What is 8 / 8 = ?\n"
            + "(a) 0\n(b) 0.5\n(c) 1\n(d) 1.5\n";

    String q13 = "What is 2^3 = ?\n"
            + "(a) 2\n(b) 4\n(c) 6\n(d) 8\n";
    String q23 = "What is 8/2*4 = ?\n"
            + "(a) 8\n(b) 12\n(c) 16\n(d) 20\n";
    String q33 = "What is 9*9 = ?\n"
            + "(a) 27\n(b) 49\n(c) 64\n(d) 81\n";*/

    private void TakeTest(Maths [] math){
        for(int i = 0; i<math.length; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n"+math[i].Questions);
            String ans = sc.nextLine();
            if(ans.equals("a") || ans.equals("b") || ans.equals("c") || ans.equals("d"))
            {
                if (ans.equals(math[i].Answers)){
                    marks++;
                }
            }else
                System.out.println("Your Answer is marked wrong as it is not a,b,c or d.");
        }
        System.out.println("\nYou got "+marks+" / "+math.length);
    }

    @Override
    public void TakeClass2Quiz() {
        Maths [] test2 = {
                new Maths(MQ.q12,"c"),
                new Maths(MQ.q22,"a"),
                new Maths(MQ.q32,"c")
        };
        TakeTest(test2);
    }

    @Override
    public void TakeClass3Quiz() {
        Maths [] test3 = {
                new Maths(MQ.q13,"d"),
                new Maths(MQ.q23,"c"),
                new Maths(MQ.q33,"d")
        };
        TakeTest(test3);
    }
}