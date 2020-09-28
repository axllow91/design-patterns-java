package behavioral_pattern.memento_2;
/*
Memento Design Pattern Implementation:

    Memento pattern provides the ability to restore an object to its previous state.

Memento helps capture internal state of an object without losing encapsulation. We can store state of an object as well as restore it whenever needed later.
Generic Class Diagram:

http://www.thejavageek.com/wp-content/uploads/2016/10/MementoDesignPattern.jpg

Component involved are:

    Memento:
        Used for storing internal state of an object. Here object is instance of Originator class.
        Has relation to Originator as well as CareTaker.
    Originator:
        Creates Memento instance so that internal state can be stored.
        Uses Memento to restore to previous state.
    CareTaker: Will have relation with Memento and Originator.

Memento Pattern Example:

Consider we are playing a game in which we make a high score and we want to save that score. We want to retrieve high score even if the score is not different. How are we going to solve this problem? Let us try to think components for memento design pattern implementation. What are our pre-requisites?

    There should be some way in which state of object can be saved.
    We don’t want calling code to directly have access to memento object.
    Memento object should only be created through Orignator. i.e. CareTaker in itself should not be able to perform any operations on it.

Let us design our classes based on above analysis.

    Create interface MementoToUser which is a medium for User to access Memento. It will not have any operations defined.
    Create interface MementoToController which is a medium for game controller to perform operations on it. i.e. we want to get score it.
    Create a class Memento which implements both MementoToUser and MementoToController.
    Create a parameterized constructor for Memento to take one integer parameter. This is required because we are going to create this object by passing highest score to it.
    Implement getScore() method so that it returns highest score.
    Create an interface Game and declare methods saveGame(), loadGame(MementoToUser memento), setHighestScore(int score) and getHighestScore()
    Create class GameImpl which implements Game.

    http://www.thejavageek.com/wp-content/uploads/2016/10/MementoExampleClassDiagram.jpg

*
*
* */
public class Main {
    public static void main(String[] args) {
        Game game = new GameImpl(); // 1
        game.setHighestScore(200);  // 2
        System.out.println(game.getHighestScore());
        MementoToUser memento = game.saveGame(); //3
        game.setHighestScore(100); //4
        System.out.println(game.getHighestScore() + " 1 highestScore - ");
        game.loadGame(memento); //5
        System.out.println(game.getHighestScore() + " 2 highestScore - ");

    }
}
