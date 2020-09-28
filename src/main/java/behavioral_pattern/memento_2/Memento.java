package behavioral_pattern.memento_2;

public class Memento implements MementoToController, MementoToUser {

    private int score;

    public Memento(int score) {
        this.score = score;
    }

    @Override
    public int getScore() {
        return score;
    }
}
