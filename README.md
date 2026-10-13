# Java Trivia Game

A two-player, console-based trivia game developed in Java. This project demonstrates object-oriented programming (OOP), data structures, and interactive game logic.

## Features

- **Two-Player Gameplay:** Players take turns answering trivia questions.
- **Interactive Questions:** Multiple-choice questions with three answer options (A, B, C).
- **Score Tracking:** Tracks each player's score based on correct answers.
- **Queue Implementation:** Manages trivia cards in the game deck.
- **Stack Implementation:** Manages discarded cards.
- **Card Recycling:** Correctly answered cards return to the deck, while incorrectly answered cards move to the discard pile.

## Technologies Used

- Java
- Eclipse IDE
- Object-Oriented Programming (OOP)
- Data Structures: Queue and Stack

## Project Structure

```text
src/
├── cs211_Assignment7_Trivia_Game/
│   ├── Main.java
│   ├── TriviaGame.java
│   ├── TriviaCard.java
│   ├── TriviaDeck.java
│   └── DiscardPile.java
└── module-info.java
```

## How to Run

1. Open Eclipse IDE.
2. Import the project source code into a Java project.
3. Open `Main.java`.
4. Select **Run As → Java Application**.
5. Follow the instructions in the Console to play.

## Example Gameplay

```text
Player 1's turn.
What is the capital of France?
A. Paris
B. London
C. Berlin
Enter your answer (A/B/C): A

Correct!
```

## Learning Outcomes

This project provided hands-on experience with:

- Designing programs using multiple Java classes.
- Applying queue and stack data structures.
- Implementing conditional logic, loops, and user input.
- Building a turn-based game with score tracking.

## Project Background

Originally developed as part of a Java programming course (CS 211).
