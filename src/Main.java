import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("REVERSE AKINATOR");
        FruitCategory.Fruit fruit = fruitToBeGuessed();

        int lives = 5;
        while (true) {
            if (lives == 0) {
                System.out.println("Game Over!");
                break;
            }

            String question = chooseQuestion();
            if (question.equals("quit")) break;
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
        return;
    }
}