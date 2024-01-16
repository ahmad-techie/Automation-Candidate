package dev.habibzad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criteria {

    List<Integer> scoreList;

    private final String title;
    private final List<String> questions;

    private final Scanner scanner;

    public Criteria(Scanner scanner, String title, String question1, String question2) {
        this.title = title;
        this.questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        scoreList = new ArrayList<>();
        this.scanner = scanner;
    }

    public void askQuestions() {
        for (String question : questions) {
            System.out.println(question + " \nRate on a scale of 1 to 5, where 1 represents the lowest score and 5 signifies the highest rating");
            boolean validInput = false;
            do {
                try {
                    String input = scanner.nextLine();
                    scoreList.add(Integer.parseInt(input));
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid entry... Add a valid number");
                }
            } while (!validInput);
        }
    }


    public int getScore(){
        int score = 1;
        for (Integer i : scoreList){
            score*=i;
        }
        return score;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getQuestions() {
        return questions;
    }
}
