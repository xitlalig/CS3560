import java.util.ArrayList;
import java.util.List;

class SingChoiceStudent extends Student
{
    private String answer;

    public SingChoiceStudent(String id, String answer)
    {
        super(id);
        this.answer = answer;
    }

    @Override
    List<String> submitAnswer()
    {
        List<String> answers = new ArrayList<>();
        answers.add(answer);

        return answers;
    }
}