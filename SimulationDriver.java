import java.util.ArrayList;
import java.util.List;

public class SimulationDriver
{
    public static void main(String args[])
    {
        String question1 = "Which of the following are your favorite pets?";
        String[] answer1 = {"Dog", "Cat", "Gecko", "Fish", "Bunny"};
        Question m1 = new MultipleChoiceQuestion(question1, answer1);

        String question2 = "Which Sanrio character is a cat?";
        String[] answer2 = {"Pochacco", "Pompompurin", "My Melody", "Hello Kitty", "Kuromi"};
        Question s1 = new SingleChoiceQuestion(question2, answer2);

        VotingService one = new VotingService(m1);
        VotingService two = new VotingService(s1);

        int numOfStu = 75;

        //Question 1
        for(int i = 0; i < numOfStu; i++)
        {
            String stuID = "" + (i + 1);
            List<String> randAns = new ArrayList<>();
            int choiceCount = answer1.length;
            int randChoice = (int)(Math.random() * choiceCount) + 1;

            for(int j = 0; j < randChoice; j++)
            {   
                randAns.add(answer1[(int)(Math.random() * choiceCount)]);
            }

            Student s = new MultChoiceStudent(stuID, randAns);
            one.submitAnswer(s);
        }


        //Question 2
        for(int i = 0; i < numOfStu; i++)
        {
            String stuID = "" + (i + 1);
            String randAns = answer2[(int)(Math.random() * answer2.length)];
            Student stu = new SingChoiceStudent(stuID, randAns);
            two.submitAnswer(stu);
        }

        one.print();
        System.out.println();
        two.print();
        System.out.println();
    }
}