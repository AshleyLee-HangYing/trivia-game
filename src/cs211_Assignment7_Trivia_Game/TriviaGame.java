package cs211_Assignment7_Trivia_Game;

import java.util.Scanner;

public class TriviaGame {
    private TriviaDeck deck = new TriviaDeck();
    private DiscardPile discard = new DiscardPile();
    private int player1Score = 0;
    private int player2Score = 0;
    private Scanner scanner = new Scanner(System.in);

    public void startGame() {
        // Load trivia cards into deck
        loadCards();

        int currentPlayer = 1;
        while (!deck.isEmpty() || !discard.isEmpty()) {
            System.out.println("\nPlayer " + currentPlayer + "'s turn.");

            TriviaCard card;
            if (!discard.isEmpty()) {
                System.out.println("Top card in discard pile:");
                System.out.println(discard.peek().getQuestion());
                System.out.print("Take this card? (Y/N): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("Y")) {
                    card = discard.pop();
                } else {
                    card = deck.dequeue();
                }
            } else {
                card = deck.dequeue();
            }

            if (card == null) break;

            System.out.println(card.getQuestion());
            System.out.println(card.getOptions());
            System.out.print("Enter your answer (A/B/C): ");
            char answer = scanner.nextLine().toUpperCase().charAt(0);

            if (card.isCorrect(answer)) {
                System.out.println("Correct!");
                if (currentPlayer == 1) player1Score++;
                else player2Score++;
                deck.enqueue(card);
            } else {
                System.out.println("Wrong. The correct answer was: " + card.getCorrectAnswer());
                discard.push(card);
            }

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        System.out.println("\nGame Over!");
        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);
    }

    private void loadCards() {
        deck.enqueue(new TriviaCard("What is the capital of France?", "Paris", "London", "Berlin", 'A'));
        deck.enqueue(new TriviaCard("Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", 'B'));
        deck.enqueue(new TriviaCard("What is 2 + 2?", "3", "4", "5", 'B'));
        // Add more cards here
    }
}
