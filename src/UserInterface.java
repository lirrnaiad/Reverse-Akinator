import Fruit.*;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("AKINATOR REVERSED");
        System.out.println();

        System.out.println("Choose a category:");
        System.out.println("[1] - Fruit");
        System.out.println("More categories coming soon!");
        System.out.print("Category: ");
        String choice = scanner.nextLine();

        switch(choice) {
            case "1":
                gameLoop("Fruit");

        }
    }

    public void gameLoop(String category) {
        switch (category) {
            case "Fruit" -> {
                System.out.println("FRUIT CATEGORY");
                System.out.println("Guess what fruit it is! Choose a question from the three given.");
                System.out.println();
                FruitCollection fruits = new FruitCollection();
                fruits.populateFruitCollection();
                Fruit fruit = fruits.getRandomFruit();
                FruitQuestions questions = new FruitQuestions(fruit);
                while (true) {
                    int questionsLeft = (questions.questionCount() - questions.questionAlreadyAsked() - 2);
                    System.out.println("QUESTIONS LEFT: " + questionsLeft);

                    if (questionsLeft == 0) {
                        System.out.println("You've ran out of questions! What will you do?");
                        System.out.println("Type 'answer' to answer what fruit you think it is");
                        System.out.println("Type 'history' to see the questions you asked");
                        System.out.println("Type 'quit' to exit and see the answer");
                        System.out.print("Choice: ");
                        String choice = scanner.nextLine();

                        if (choice.equalsIgnoreCase("answer")) {
                            System.out.print("Answer: ");
                            String answer = scanner.nextLine();

                            if (answer.equalsIgnoreCase(fruit.getName())) {
                                System.out.println("Correct! That was close!");
                            } else {
                                System.out.println("Incorrect! The answer was: " + fruit.getName());
                                System.out.println("Game Over!");
                            }
                            break;
                        }

                        if (choice.equals("history")) {
                            System.out.println();
                            questions.printHistory();
                            System.out.println();
                            continue;
                        }

                        if (choice.equals("quit")) {
                            System.out.println("You gave up! The answer was: " + fruit.getName());
                            break;
                        }

                        System.out.println("The answer was: " + fruit.getName());
                        break;
                    }

                    ArrayList<String> givenQuestions = questions.chooseRandomQuestions();
                    for (int i = 0; i < givenQuestions.size(); i++) {
                        System.out.println("[" + (i + 1) + "]: " + givenQuestions.get(i));
                    }
                    System.out.println("Type 'answer' to answer what fruit you think it is");
                    System.out.println("Type 'history' to see what questions you've already asked");
                    System.out.println("Type 'quit' to exit and see the answer");

                    System.out.print("Choice: ");
                    String chosenQuestion = null;
                    chosenQuestion = scanner.nextLine();

                    if (chosenQuestion.isBlank()) {
                        System.out.println("Please enter a command!");
                    }

                    if (chosenQuestion.equals("quit")) {
                        System.out.println("The answer was: " + fruit.getName());
                        break;
                    }

                    else if (chosenQuestion.equals("answer")) {
                        System.out.print("Answer: ");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase(fruit.getName())) {
                            System.out.println("Correct! Nice job!");
                            break;
                        } else {
                            System.out.println("Incorrect! Try again!");
                        }
                    }

                    else if (chosenQuestion.equals("history")) {
                        System.out.println();
                        questions.printHistory();
                    }

                    else if (Integer.parseInt(chosenQuestion) > 0 && Integer.parseInt(chosenQuestion) < givenQuestions.size() + 1) {
                        questions.answerQuestion(givenQuestions.get(Integer.parseInt(chosenQuestion) - 1));
                    }

                    else {
                        System.out.println("Invalid command! Generating new questions");
                    }

                    System.out.println();
                }
            }
        }
    }
}
