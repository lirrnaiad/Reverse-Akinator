import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("REVERSE AKINATOR");

        // Choose a random fruit
        FruitCategory.Fruit fruit = fruitToBeGuessed();

        // Total lives
        int lives = 5;

        // Game loop
        while (true) {

            // If lives reach 0, it's game over!
            if (lives == 0) {
                System.out.println("Game Over!");
                break;
            }

            // Choose from 3 questions, in which the console will answer
            String question = chooseQuestion();

            // If user chose to quit, exit the program
            if (question.equals("quit")) break;

            // If user chose to answer, lets the user type what they think the answer is
            else if (question.equals("answer")) {
                System.out.print("Your Answer: ");
                String answer = input.nextLine();

                // If it's correct, good job!
                assert fruit != null;
                if (answer.equalsIgnoreCase(fruit.getName())) {
                    System.out.println("Correct! Good job!");
                    break;

                    // If it's incorrect, reduce lives by one. Try again!
                } else {
                    System.out.println("Incorrect! Try again!");
                    lives--;
                    System.out.println("Lives left: " + lives);
                    System.out.println();
                }
            }

            // Otherwise, print the answer of the question the user chose
            printAnswer(question, fruit);
        }
    }

    public static FruitCategory.Fruit fruitToBeGuessed() {
        Random choose = new Random();

        int number = choose.nextInt(5);

        switch (number) {
            case 0:
                FruitCategory.Fruit apple = new FruitCategory.Fruit("Apple", FruitCategory.FruitProperties.appleProperties());
                return apple;

            case 1:
                FruitCategory.Fruit banana = new FruitCategory.Fruit("Banana", FruitCategory.FruitProperties.bananaProperties());
                return banana;

            case 2:
                FruitCategory.Fruit cherry = new FruitCategory.Fruit("Cherry", FruitCategory.FruitProperties.cherryProperties());
                return cherry;

            case 3:
                FruitCategory.Fruit grape = new FruitCategory.Fruit("Grapes", FruitCategory.FruitProperties.grapeProperties());
                return grape;

            case 4:
                FruitCategory.Fruit kiwi = new FruitCategory.Fruit("Kiwi", FruitCategory.FruitProperties.kiwiProperties());
                return kiwi;
        }

        return null;
    }

    public static String chooseQuestion() {
        Random rand = new Random();
        Scanner choose = new Scanner(System.in);

        String[] questions = new String[3];

        for (int i = 0; i < 3; i++) {
            int questionRandom = rand.nextInt(26);

            switch (questionRandom) {
                case 0:
                    questions[i] = "Is it round?";
                    break;

                case 1:
                    questions[i] = "Is it big?";
                    break;

                case 2:
                    questions[i] = "Is it small?";
                    break;

                case 3:
                    questions[i] = "Is it sweet?";
                    break;

                case 4:
                    questions[i] = "Is it sour?";
                    break;

                case 5:
                    questions[i] = "Is it light?";
                    break;

                case 6:
                    questions[i] = "Is it heavy?";
                    break;

                case 7:
                    questions[i] = "Is the outside red?";
                    break;

                case 8:
                    questions[i] = "Is the outside orange?";
                    break;

                case 9:
                    questions[i] = "Is the outside yellow?";
                    break;

                case 10:
                    questions[i] = "Is the outside green?";
                    break;

                case 11:
                    questions[i] = "Is the outside white?";
                    break;

                case 12:
                    questions[i] = "Is the inside red?";
                    break;

                case 13:
                    questions[i] = "Is the inside orange?";
                    break;

                case 14:
                    questions[i] = "Is the inside yellow?";
                    break;

                case 15:
                    questions[i] = "Is the inside green?";
                    break;

                case 16:
                    questions[i] = "Is the inside white?";
                    break;

                case 17:
                    questions[i] = "Is it expensive?";
                    break;

                case 18:
                    questions[i] = "Is it soft?";
                    break;

                case 19:
                    questions[i] = "Is the outside hard?";
                    break;

                case 20:
                    questions[i] = "Is the outside soft?";
                    break;

                case 21:
                    questions[i] = "Is the inside hard?";
                    break;

                case 22:
                    questions[i] = "Is the inside soft?";
                    break;

                case 23:
                    questions[i] = "Do you eat the seeds?";
                    break;

                case 24:
                    questions[i] = "Does it have many seeds?";
                    break;

                case 25:
                    questions[i] = "Do you eat the skin?";
                    break;
            }
        }

        System.out.println("Input 69 to answer, or 420 to quit.");
        System.out.println("Choose a question:");
        System.out.println("1. " + questions[0]);
        System.out.println("2. " + questions[1]);
        System.out.println("3. " + questions[2]);

        int choice = choose.nextInt();
        if (choice == 69) {
            return "answer";
        } else if (choice == 420) {
            return "quit";
        } else {
            return questions[choice - 1];
        }
    }

    private static void printAnswer(String question, FruitCategory.Fruit fruit) {
        switch (question) {
            case "Is the fruit round?":
                System.out.println(question + " " + answer(fruit.getProperties().isRound));
                System.out.println();
                break;

            case "Is it big?":
                System.out.println(question + " " + answer(fruit.getProperties().isBig));
                System.out.println();
                break;

            case "Is it small?":
                System.out.println(question + " " + answer(fruit.getProperties().isSmall));
                System.out.println();
                break;

            case "Is it sweet?":
                System.out.println(question + " " + answer(fruit.getProperties().isSweet));
                System.out.println();
                break;

            case "Is it sour?":
                System.out.println(question + " " + answer(fruit.getProperties().isSour));
                System.out.println();
                break;

            case "Is it light?":
                System.out.println(question + " " + answer(fruit.getProperties().isLight));
                System.out.println();
                break;

            case "Is it heavy?":
                System.out.println(question + " " + answer(fruit.getProperties().isHeavy));
                System.out.println();
                break;

            case "Is the outside red?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideRed));
                System.out.println();
                break;

            case "Is the outside orange?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideOrange));
                System.out.println();
                break;

            case "Is the outside yellow?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideYellow));
                System.out.println();
                break;

            case "Is the outside green?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideGreen));
                System.out.println();
                break;

            case "Is the outside white?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideWhite));
                System.out.println();
                break;

            case "Is the inside red?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideRed));
                System.out.println();
                break;

            case "Is the inside orange?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideOrange));
                System.out.println();
                break;

            case "Is the inside yellow?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideYellow));
                System.out.println();
                break;

            case "Is the inside green?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideGreen));
                System.out.println();
                break;

            case "Is the inside white?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideWhite));
                System.out.println();
                break;

            case "Is it expensive?":
                System.out.println(question + " " + answer(fruit.getProperties().isExpensive));
                System.out.println();
                break;

            case "Is it soft?":
                System.out.println(question + " " + answer(fruit.getProperties().isSoft));
                System.out.println();
                break;

            case "Is the outside hard?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideHard));
                System.out.println();
                break;

            case "Is the outside soft?":
                System.out.println(question + " " + answer(fruit.getProperties().isOutsideSoft));
                System.out.println();
                break;

            case "Is the inside hard?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideHard));
                System.out.println();
                break;

            case "Is the inside soft?":
                System.out.println(question + " " + answer(fruit.getProperties().isInsideSoft));
                System.out.println();
                break;

            case "Do you eat the seeds?":
                System.out.println(question + " " + answer(fruit.getProperties().areSeedsEaten));
                System.out.println();
                break;

            case "Does it have many seeds?":
                System.out.println(question + " " + answer(fruit.getProperties().hasManySeeds));
                System.out.println();
                break;

            case "Do you eat the skin?":
                System.out.println(question + " " + answer(fruit.getProperties().isSkinEaten));
                System.out.println();
                break;
        }
    }

    public static String answer(int ans) {
        if (ans == 1) return "Yes";
        else if (ans == 2) return "Somewhat yes";
        else if (ans == 3) return "Neutral";
        else if (ans == 4) return "Somewhat no";
        else return "No";
    }
}