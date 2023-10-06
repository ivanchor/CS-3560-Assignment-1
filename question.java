import java.util.Random;
import java.util.Vector;


public class question 
{
    private Vector<String> answer = new Vector<String>();
    private String type;
    private int numberOfAnswers;

    // Return question answers
    public Vector<String> getAnswer()
    {
        return answer;
    }

    // Return question type: single or multiple choice
    public String getType()
    {
        return type;
    }

    // Return the number of answers for the question
    public int getNumberOfAnswers()
    {
        return numberOfAnswers;
    }

    // Creates new single choice question with random answer A, B, C, or D
    public question()
    {
        numberOfAnswers = 1;
        Random rand = new Random();
        int answer_num = rand.nextInt(3);
        type = "single";

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
            }case(3):
            {
                answer.add("D");
                break;
            }
        }
    }

    // Creates new multiple choice question with random answer A, B, C, or D
    public question(int amount)
    {
        numberOfAnswers = amount;
        Random rand = new Random();
        type = "multiple";

        if(amount > 0 && amount <=4)
        {
            for(int i = 0; i < amount; i++)
            {
                int answer_num = rand.nextInt(3);
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