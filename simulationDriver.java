import java.util.Random;

public class simulationDriver 
{
    public static void main(String[] args)
    {
        // Creates single answer question
        question question1 = new question();
        // Saves amount of answers question1 has
        int questionAmount = question1.getNumberOfAnswers();
        // Creates new votingService for question1
        votingService iVote = new votingService(question1);
        
        // Generates random amount of students
        Random rand = new Random();
        int studentGeneration = rand.nextInt(100);
        student[] studentList = new student[studentGeneration];

        // Adds students to array
        // Generates student answers
        // Adds students answers to votingService
        for(int i = 0; i < studentGeneration; i++)
        {
            studentList[i] = new student();
            studentList[i].submitAnswer(questionAmount);
            iVote.questionSubmission(studentList[i]);
        }

        // Displays results for question1 type: single
        System.out.println("Number of students: " + studentGeneration);
        iVote.displayResults();





        // Creates multiple answer question
        question question2 = new question(3);
        // Saves amount of answers question2 has
        int questionAmount2 = question2.getNumberOfAnswers();
        // Creates new votingService for question2
        votingService iVote2 = new votingService(question2);
        
        // Generates random amount of students
        Random rand2 = new Random();
        int studentGeneration2 = rand.nextInt(100);
        student[] studentList2 = new student[studentGeneration2];

        // Adds students to array
        // Generates student answers
        // Adds students answers to votingService
        for(int i = 0; i < studentGeneration2; i++)
        {
            studentList2[i] = new student();
            studentList2[i].submitAnswer(questionAmount2);
            iVote2.questionSubmission(studentList2[i]);
        }

        // Displays results for question1 type: single
        System.out.println("Number of students: " + studentGeneration2);
        iVote2.displayResults();
    }
}
