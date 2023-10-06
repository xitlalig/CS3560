class SingleChoiceQuestion implements Question
{
    private String question;
    private String[] answers;

    public SingleChoiceQuestion(String question, String[] answers)
    {
        this.question = question;
        this.answers = answers;
    }

    @Override
    public String getQuestion()
    {
        return question;
    }

    @Override
    public String[] getAnswers()
    {
        return answers;
    }
}