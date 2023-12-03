import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("REVERSE AKINATOR");
        Fruits.Fruit fruit = fruitToBeGuessed();

        int lives = 5;
        while (true) {
            if (lives == 0) {
                System.out.println("Game Over!");
                break;
            }

            String question = chooseQuestion();
            if (question.equals("quit")) break;

            else if (question.equals("answer")) {
                String answer = scanner.nextLine();

                assert fruit != null;
                if (answer.equalsIgnoreCase(fruit.getName())) {
                    System.out.println("Correct! Good job!");
                    break;
                } else {
                    System.out.println("Incorrect! Try again!");
                    lives--;
                    System.out.println("Lives left: " + lives);
                    System.out.println();
                }
            }
            printAnswer(question, fruit);
        }
    }

    public static String chooseQuestion() {
        Random rand = new Random();
        Scanner choose = new Scanner(System.in);

        String[] questions = new String[3];

        for (int i = 0; i < 3; i++) {
            int questionRandom = rand.nextInt(0, 12);

            switch (questionRandom) {
                case 0:
                    questions[i] = "Is the fruit round?";
                    break;

                case 1:
                    questions[i] = "Is the fruit's color red?";
                    break;

                case 2:
                    questions[i] = "Is the fruit's color yellow?";
                    break;

                case 3:
                    questions[i] = "Is the fruit's color orange?";
                    break;

                case 4:
                    questions[i] = "Is the fruit's color green?";
                    break;

                case 5:
                    questions[i] = "Is the fruit heavy?";
                    break;

                case 6:
                    questions[i] = "Is the fruit light?";
                    break;

                case 7:
                    questions[i] = "Is the fruit big?";
                    break;

                case 8:
                    questions[i] = "Is the fruit small?";
                    break;

                case 9:
                    questions[i] = "Is the fruit sweet?";
                    break;

                case 10:
                    questions[i] = "Is the fruit sour?";
                    break;

                case 11:
                    questions[i] = "Can the fruit be eaten with its skin on?";
                    break;

                case 12:
                    questions[i] = "Is the fruit commonly associated with a holiday?";
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

    private static void printAnswer(String question, Fruits.Fruit fruit) {
        switch (question) {
            case "Is the fruit round?":
                System.out.println(question + " " + (fruit.getProperties().isRound ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit's color red?":
                System.out.println(question + " " + (fruit.getProperties().isColorRed ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit's color yellow?":
                System.out.println(question + " " + (fruit.getProperties().isColorYellow ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit's color orange?":
                System.out.println(question + " " + (fruit.getProperties().isColorOrange ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit's color green?":
                System.out.println(question + " " + (fruit.getProperties().isColorGreen ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit heavy?":
                System.out.println(question + " " + (fruit.getProperties().isHeavy ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit light?":
                System.out.println(question + " " + (fruit.getProperties().isLight ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit big?":
                System.out.println(question + " " + (fruit.getProperties().isBig ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit small?":
                System.out.println(question + " " + (fruit.getProperties().isSmall ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit sweet?":
                System.out.println(question + " " + (fruit.getProperties().isSweet ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit sour?":
                System.out.println(question + " " + (fruit.getProperties().isSour ? "Yes" : "No"));
                System.out.println();
                break;

            case "Can the fruit be eaten with its skin on?":
                System.out.println(question + " " + (fruit.getProperties().isEatenWithSkinOn ? "Yes" : "No"));
                System.out.println();
                break;

            case "Is the fruit commonly associated with a holiday?":
                System.out.println(question + " " + (fruit.getProperties().isAssociatedWithHoliday ? "Yes" : "No"));
                System.out.println();
                break;
        }
    }

    public static Fruits.Fruit fruitToBeGuessed() {
        Random choose = new Random();

        int number = choose.nextInt(0, 4);

        switch(number) {
            case 0:
                Fruits.Fruit apple = new Fruits.Fruit("Apple", Fruits.FruitPropertiesFactory.createAppleProperties());
                return apple;

            case 1:
                Fruits.Fruit orange = new Fruits.Fruit("Orange", Fruits.FruitPropertiesFactory.createOrangeProperties());
                return orange;

            case 2:
                Fruits.Fruit banana = new Fruits.Fruit("Banana" , Fruits.FruitPropertiesFactory.createBananaProperties());
                return banana;

            case 3:
                Fruits.Fruit watermelon = new Fruits.Fruit("Watermelon", Fruits.FruitPropertiesFactory.createWatermelonProperties());
                return watermelon;

            case 4:
                Fruits.Fruit mango = new Fruits.Fruit("Mango", Fruits.FruitPropertiesFactory.createMangoProperties());
                return mango;

        }

        return null;
    }
}
