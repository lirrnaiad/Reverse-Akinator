package Fruit;

import java.util.ArrayList;
import java.util.Random;

public class FruitQuestions {
    private Fruit fruit;
    private final String[] questions;
    private ArrayList<String> questionsAsked;
    public FruitQuestions(Fruit fruit) {
        this.fruit = fruit;
        this.questions = new String[] {"Is it round?",
                                        "Is it big?",
                                        "Is it small?",
                                        "Is it sweet?",
                                        "Is it sour?",
                                        "Is it light?",
                                        "Is it heavy?",
                                        "Is the outside red?",
                                        "Is the outside orange?",
                                        "Is the outside yellow?",
                                        "Is the outside green?",
                                        "Is the outside white?",
                                        "Is the inside red?",
                                        "Is the inside orange?",
                                        "Is the inside yellow?",
                                        "Is the inside green?",
                                        "Is the inside white?",
                                        "Is it expensive?",
                                        "Is it soft?",
                                        "Is the outside soft?",
                                        "Is the outside hard?",
                                        "Is the inside soft?",
                                        "Is the inside hard?",
                                        "Are the seeds eaten?",
                                        "Does it have many seeds?",
                                        "Is the skin usually eaten?"};

        this.questionsAsked = new ArrayList<>();
    }

    public int questionCount() {
        return questions.length;
    }

    public int questionAlreadyAsked() {
        return questionsAsked.size();
    }

    public ArrayList<String> chooseRandomQuestions() {
        ArrayList<String> chosenQuestions = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; chosenQuestions.size() < 3; i++) {
            int q = rand.nextInt(0, 26);

            // Check if question has already been asked previously
            if (questionsAsked.contains(questions[q])) {
                continue;
            }

            // Check if question is already one of the chosen questions
            if (chosenQuestions.contains(questions[q])) {
                continue;
            }

            if (questionAlreadyAsked() > 23) {
                break;
            }

            chosenQuestions.add(questions[q]);
        }

        return chosenQuestions;
    }

    public void addToQuestionsAsked(String question) {
        questionsAsked.add(question);
    }

    public void answerQuestion(String question) {
        switch (question) {
            case "Is it round?" -> {
                System.out.println("Is it round? " + fruit.isRound());
                addToQuestionsAsked(question);
            }

            case "Is it big?" -> {
                System.out.println("Is it big? " + fruit.isBig());
                addToQuestionsAsked(question);
            }

            case "Is it small?" -> {
                System.out.println("Is it small? " + fruit.isSmall());
                addToQuestionsAsked(question);
            }

            case "Is it sweet?" -> {
                System.out.println("Is it sweet? " + fruit.isSweet());
                addToQuestionsAsked(question);
            }

            case "Is it sour?" -> {
                System.out.println("Is it sour? " + fruit.isSour());
                addToQuestionsAsked(question);
            }

            case "Is it light?" -> {
                System.out.println("Is it light? " + fruit.isLight());
                addToQuestionsAsked(question);
            }

            case "Is it heavy?" -> {
                System.out.println("Is it heavy? " + fruit.isHeavy());
                addToQuestionsAsked(question);
            }

            case "Is the outside red?" -> {
                System.out.println("Is the outside red? " + fruit.isOutsideRed());
                addToQuestionsAsked(question);
            }

            case "Is the outside orange?" -> {
                System.out.println("Is the outside orange? " + fruit.isOutsideOrange());
                addToQuestionsAsked(question);
            }

            case "Is the outside yellow?" -> {
                System.out.println("Is the outside yellow? " + fruit.isOutsideYellow());
                addToQuestionsAsked(question);
            }

            case "Is the outside green?" -> {
                System.out.println("Is the outside green? " + fruit.isOutsideGreen());
                addToQuestionsAsked(question);
            }

            case "Is the outside white?" -> {
                System.out.println("Is the outside white? " + fruit.isOutsideWhite());
                addToQuestionsAsked(question);
            }

            case "Is the inside red?" -> {
                System.out.println("Is the inside red? " + fruit.isInsideRed());
                addToQuestionsAsked(question);
            }

            case "Is the inside orange?" -> {
                System.out.println("Is the inside orange? " + fruit.isInsideOrange());
                addToQuestionsAsked(question);
            }

            case "Is the inside yellow?" -> {
                System.out.println("Is the inside yellow? " + fruit.isInsideYellow());
                addToQuestionsAsked(question);
            }

            case "Is the inside green?" -> {
                System.out.println("Is the inside green? " + fruit.isInsideGreen());
                addToQuestionsAsked(question);
            }

            case "Is the inside white?" -> {
                System.out.println("Is the inside white? " + fruit.isInsideWhite());
                addToQuestionsAsked(question);
            }

            case "Is it expensive?" -> {
                System.out.println("Is it expensive? " + fruit.isExpensive());
                addToQuestionsAsked(question);
            }

            case "Is it soft?" -> {
                System.out.println("Is it soft? " + fruit.isSoft());
                addToQuestionsAsked(question);
            }

            case "Is the outside soft?" -> {
                System.out.println("Is the outside soft? " + fruit.isOutsideSoft());
                addToQuestionsAsked(question);
            }

            case "Is the outside hard?" -> {
                System.out.println("Is the outside hard? " + fruit.isOutsideHard());
                addToQuestionsAsked(question);
            }

            case "Is the inside soft?" -> {
                System.out.println("Is the inside soft? " + fruit.isInsideSoft());
                addToQuestionsAsked(question);
            }

            case "Is the inside hard?" -> {
                System.out.println("Is the inside hard? " + fruit.isInsideHard());
                addToQuestionsAsked(question);
            }

            case "Are the seeds eaten?" -> {
                System.out.println("Are the seeds eaten? " + fruit.seedsEaten());
                addToQuestionsAsked(question);
            }

            case "Does it have many seeds?" -> {
                System.out.println("Does it have many seeds? " + fruit.hasManySeeds());
                addToQuestionsAsked(question);
            }

            case "Is the skin usually eaten?" -> {
                System.out.println("Is the skin usually eaten? " + fruit.skinEaten());
                addToQuestionsAsked(question);
            }
        }
    }

    public void printHistory() {
        System.out.println("HISTORY:");
        for (String question : questionsAsked) {
            switch (question) {
                case "Is it round?" -> {
                    System.out.println("Is it round? " + fruit.isRound());
                }

                case "Is it big?" -> {
                    System.out.println("Is it big? " + fruit.isBig());
                }

                case "Is it small?" -> {
                    System.out.println("Is it small? " + fruit.isSmall());
                }

                case "Is it sweet?" -> {
                    System.out.println("Is it sweet? " + fruit.isSweet());
                }

                case "Is it sour?" -> {
                    System.out.println("Is it sour? " + fruit.isSour());
                }

                case "Is it light?" -> {
                    System.out.println("Is it light? " + fruit.isLight());
                }

                case "Is it heavy?" -> {
                    System.out.println("Is it heavy? " + fruit.isHeavy());
                }

                case "Is the outside red?" -> {
                    System.out.println("Is the outside red? " + fruit.isOutsideRed());
                }

                case "Is the outside orange?" -> {
                    System.out.println("Is the outside orange? " + fruit.isOutsideOrange());
                }

                case "Is the outside yellow?" -> {
                    System.out.println("Is the outside yellow? " + fruit.isOutsideYellow());
                }

                case "Is the outside green?" -> {
                    System.out.println("Is the outside green? " + fruit.isOutsideGreen());
                }

                case "Is the outside white?" -> {
                    System.out.println("Is the outside white? " + fruit.isOutsideWhite());
                }

                case "Is the inside red?" -> {
                    System.out.println("Is the inside red? " + fruit.isInsideRed());
                }

                case "Is the inside orange?" -> {
                    System.out.println("Is the inside orange? " + fruit.isInsideOrange());
                }

                case "Is the inside yellow?" -> {
                    System.out.println("Is the inside yellow? " + fruit.isInsideYellow());
                }

                case "Is the inside green?" -> {
                    System.out.println("Is the inside green? " + fruit.isInsideGreen());
                }

                case "Is the inside white?" -> {
                    System.out.println("Is the inside white? " + fruit.isInsideWhite());
                }

                case "Is it expensive?" -> {
                    System.out.println("Is it expensive? " + fruit.isExpensive());
                }

                case "Is it soft?" -> {
                    System.out.println("Is it soft? " + fruit.isSoft());
                }

                case "Is the outside soft?" -> {
                    System.out.println("Is the outside soft? " + fruit.isOutsideSoft());
                }

                case "Is the outside hard?" -> {
                    System.out.println("Is the outside hard? " + fruit.isOutsideHard());
                }

                case "Is the inside soft?" -> {
                    System.out.println("Is the inside soft? " + fruit.isInsideSoft());
                }

                case "Is the inside hard?" -> {
                    System.out.println("Is the inside hard? " + fruit.isInsideHard());
                }

                case "Are the seeds eaten?" -> {
                    System.out.println("Are the seeds eaten? " + fruit.seedsEaten());
                }

                case "Does it have many seeds?" -> {
                    System.out.println("Does it have many seeds? " + fruit.hasManySeeds());
                }

                case "Is the skin usually eaten?" -> {
                    System.out.println("Is the skin usually eaten? " + fruit.skinEaten());
                }
            }
        }
    }
}
