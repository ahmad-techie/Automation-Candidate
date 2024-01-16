package dev.habibzad;

import java.util.*;

public class AutomationCandidate {
    static Scanner scanner = new Scanner(System.in);
    private final List<Criteria> criteriaList = new ArrayList<>();

    private AutomationCandidate() {
        criteriaList.add(new RiskToCustomer(scanner, "Risk to Customer", "Probability - Frequency of use by customer", "Impact - If broken, what’s the impact on the customer?"));
        criteriaList.add(new ValueForTest(scanner, "Value for Test", "Distinctness - Does this test provide new info?", "Induction to Action - How quickly would this failure be fixed"));
        criteriaList.add(new CostEfficiency(scanner, "Cost-Efficiency", "Quickness - How quickly can this be scripted", "Ease How easy will it be to script this?"));
        criteriaList.add(new History(scanner, "History", "Similar to weak areas - Volume of historical failures in related areas", "Frequency of breaks - Volume of historical failures for this test"));
    }
    public static void main(String[] args) {
        List<String> testScenarios = new ArrayList<>();
        while (true) {
            System.out.println("Add a scenario - Type 0 to quit");
            String scenario = scanner.nextLine();
            if (scenario.equals("0")) break;
            testScenarios.add(scenario);
        }
        if (testScenarios.isEmpty()) {
            System.out.println("No feature added. Exiting the program.");
            System.exit(-1);
        }
        Map<String, Integer> automationCandidate = new HashMap<>();
        AutomationCandidate r = new AutomationCandidate();
        for (String scenario : testScenarios) {
            System.out.println("For " + scenario + " scenario:\n=====================================");
            for (Criteria criteria : r.criteriaList) {
                criteria.askQuestions();
                int score = criteria.getScore();
//                if (automationCandidate.containsKey(scenario)){
//                    automationCandidate.put(scenario, automationCandidate.get(scenario)+score);
//                }else {
//                    automationCandidate.put(scenario, score);
//                }
                automationCandidate.compute(scenario, (key, value) -> (value == null) ? score : value + score);
            }
        }
        int lineNumber = 1;
        for (Map.Entry<String, Integer> entry : automationCandidate.entrySet()) {
            int score = 1;
            score += entry.getValue();
            if (score >= 67) {
                System.out.println(lineNumber + ": " + entry.getKey() + " : Automated");
            } else if (score >= 34) {
                System.out.println(lineNumber + ": " + entry.getKey() + " : Possibly automated");
            } else {
                System.out.println(lineNumber + ": " + entry.getKey() + " Don't automate");
            }
            lineNumber++;
        }
        scanner.close();

    }

}

