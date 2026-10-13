package cs211_Assignment7_Trivia_Game;

import java.util.Stack;

public class DiscardPile {
    private Stack<TriviaCard> stack = new Stack<>();

    public void push(TriviaCard card) {
        stack.push(card);
    }

    public TriviaCard peek() {
        return stack.isEmpty() ? null : stack.peek();
    }

    public TriviaCard pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
