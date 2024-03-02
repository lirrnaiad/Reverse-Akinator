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
                    ArrayList<String> givenQuestions = questions.chooseRandomQuestions();
                    for (int i = 0; i < givenQuestions.size(); i++) {
                        System.out.println("[" + (i + 1) + "]: " + givenQuestions.get(i));
                    }
                    System.out.println("Type 'answer' to answer what fruit you think it is");
                    System.out.println("Type 'history' to see what questions you've already asked");
                    System.out.println("Type 'quit' to exit");

                    System.out.print("Choice: ");
                    String chosenQuestion = scanner.nextLine();
                    if (chosenQuestion.equals("quit")) {
                        break;
                    } else if (chosenQuestion.equals("answer")) {
                        System.out.print("Answer: ");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase(fruit.getName())) {
                            System.out.println("Correct! Nice job!");
                            break;
                        } else {
                            System.out.println("Incorrect! Try again!");
                        }
                    } else if (chosenQuestion.equals("1") || chosenQuestion.equals("2") || chosenQuestion.equals("3")) {
                        questions.answerQuestion(givenQuestions.get(Integer.parseInt(chosenQuestion) - 1));
                    }

                    System.out.println();
                }
            }
        }
    }
}
