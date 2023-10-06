import java.util.Random;
import java.util.Vector;

public class student
{
    private String ID;
    private Vector<String> answer = new Vector<String>();

    // Return student answers
    public Vector<String> getAnswer()
    {
        return answer;
    }

    // Creates new student object with random ID from 1000-10000
    public student()
    {
        Random rand = new Random();
        int student_ID = rand.nextInt(9000) + 1000;
        ID = String.valueOf(student_ID);
    }

    // Generates x random answers for the student
    public void submitAnswer(int amount)
    {
        Random rand = new Random();
        if(amount > 0 && amount <=4)
        {
            for(int i = 0; i < amount; i++)
            {
                int answer_num = rand.nextInt(4);
                switch(answer_num)
                {
                    case(0):
                    {
                        answer.add("A");
                        break;
                    }
                    case(1):
                    {
                        answer.add("B");
                        break;
                    }case(2):
                    {
                        answer.add("C");
                        break;
                    }default:
                    {
                        answer.add("D");
                        break;
                    }
                }
        }
    }
}
}