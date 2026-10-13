package cs211_Assignment7_Trivia_Game;

import java.util.LinkedList;

public class TriviaDeck {
    private LinkedList<TriviaCard> queue = new LinkedList<>();

    public void enqueue(TriviaCard card) {
        queue.addLast(card);
    }

    public TriviaCard dequeue() {
        return queue.pollFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}