package cs211_Assignment7_Trivia_Game;

public class TriviaCard {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private char correctAnswer;

    public TriviaCard(String question, String optionA, String optionB, String optionC, char correctAnswer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptions() {
        return "A. " + optionA + "\nB. " + optionB + "\nC. " + optionC;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctAnswer);
    }
}
