public class Trivia {
    public Trivia() {

    }

    public void load(String file) {
        System.out.println("Trivia.load()");
    }

    // Count of loaded trivia
    public int count() {
        System.out.println("Trivia.count()");
        return -1;
    }

    // Returns the question for a piece of trivia
    public String getQuestion(int triviaNUm) {
        System.out.println("Trivia.getQuestion()");
        return "";
    }

    // Returns the answer for a piece of trivia
    public String getAnswer(int triviaNum) {
        System.out.println("Trivia.getAnswer()");
        return "";
    }

    // Returns the choices for a piece of trivia
    public String[] getChoices(int triviaNum) {
        System.out.println("Trivia.getChoices()");
        return null;
    }

    // Checks if the provided choice is correct for a piece of trivia
    public boolean isCorrect(int triviaNum, String choice) {
        System.out.println("Trivia.isCorrect()");
        return false;
    }
}