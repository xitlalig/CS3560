import java.util.Map;
import java.util.HashMap;
import java.util.List;

class VotingService
{
    private Question q;
    private Map<String, Integer> answerCount;

    public VotingService(Question q)
    {
        this.q = q;
        this.answerCount = new HashMap<>();

        for(String a : q.getAnswers())
        {
            answerCount.put(a, 0);
        }
    }

    public void submitAnswer(Student s)
    {
        List<String> answer = s.submitAnswer();

        for(String a : answer)
        {
            answerCount.put(a, answerCount.getOrDefault(a, 0) + 1);
        }
    }

    public void print()
    {
        System.out.println(q.getQuestion());

        for(Map.Entry<String, Integer> map : answerCount.entrySet())
        {
            System.out.println(map.getKey() + " -> " +map.getValue());
        }
    }
}