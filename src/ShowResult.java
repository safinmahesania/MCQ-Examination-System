public class ShowResult {

    public void ShowScienceResult(int marks, String name, int standard) {
        System.out.println("\n\nTotal Questions: 3");
        System.out.println("Correct Answer: " +marks);
        int wrongans = 3 - marks;
        System.out.println("Wrong Answer: " +wrongans);
        if (marks > 1) {
            System.out.println("Congratulation! "+name+" of Class "+standard+" You had pass the test and been promoted.");
        } else {
            System.out.println("Sorry! "+name+" of Class "+standard+" You are unable to pass the test");
        }
    }

    public void ShowMathsResult(int marks,String name,int standard) {
        System.out.println("\n\nTotal Questions: 3");
        System.out.println("Correct Answer: " +marks);
        int wrongans = 3 - marks;
        System.out.println("Wrong Answer: " +wrongans);
        if (marks > 1) {
            System.out.println("Congratulation! "+name+" of Class "+standard+" You had pass the test and been promoted.");
        } else {
            System.out.println("Sorry! "+name+" of Class "+standard+" You are unable to pass the test");
        }
    }
}
