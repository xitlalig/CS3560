import java.util.List;

class MultChoiceStudent extends Student
{
    private List<String> a;

    public MultChoiceStudent(String id, List<String> a)
    {
        super(id);
        this.a = a;
    }

    @Override
    List<String> submitAnswer()
    {
        return a;
    }
}