class MultipleChoiceQuestion implements Question
{
    private String q;
    private String[] a;

    public MultipleChoiceQuestion(String q, String[] a)
    {
        this.q = q;
        this.a = a;
    }

    @Override
    public String getQuestion()
    {
        return q;
    }

    @Override
    public String[] getAnswers()
    {
        return a;
    }
}