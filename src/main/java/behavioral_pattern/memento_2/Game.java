package behavioral_pattern.memento_2;

public interface Game {
    MementoToUser saveGame();
    void loadGame(MementoToUser memento);
    int getHighestScore();
    void setHighestScore(int score);
}
