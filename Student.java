import java.util.List;

abstract class Student
{
    private String id;

    public Student(String id)
    {
        this.id = id;
    }

    public String getID()
    {
        return id;
    }

    abstract List<String> submitAnswer();
}