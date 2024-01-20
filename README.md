# How To Determine Which Test Cases Need To Be Automated

## Overview

Automating all test cases in software development comes with its set of challenges and drawbacks. One significant
drawback is the initial investment of time and resources required to develop and maintain automated test scripts.
Creating robust and reliable automation scripts demands a thorough understanding of the application, which can be
time-consuming. Additionally, automated tests may struggle to adapt to frequent changes in the software, leading to
increased maintenance efforts. Another challenge is the limited ability of automated testing to replicate real user
experiences comprehensively. Some aspects, such as user interface nuances and subjective feedback, are better assessed
through manual testing. Moreover, automated testing might not catch certain types of bugs that a human tester with
domain knowledge could identify. Striking the right balance between manual and automated testing is crucial to ensure
thorough and efficient software testing.

This simple Java project offers a systematic approach to identify test scenarios that need to be automated.

## Challenges of Full Test Automation

1. **Maintenance:**
    - Constant changes in active products demand significant testing resources.

2. **Time:**
    - The more tests we automate, the greater the time spent on writing and debugging.

3. **Noise:**
    - Running numerous automated tests may lead to multiple failures, often pointing to the same underlying bug.

## How It Works

1. **Input Test Scenario:**
    - Users provide the test scenario they want to assess.

2. **Answer Questions:**
    - The project prompts users to answer questions related to different aspects of the test scenario.

3. **Calculate Score:**
    - Based on user responses, the project calculates a score using specific criteria related to Risk, Value for Test,
      Cost-Efficiency, and History.

4. **Recommendation:**
    - The system provides a recommendation on whether to automate the given scenario or not.

## Criteria and Questions

### About Risk

- **Probability:**
    - Frequency of use by the customer.
- **Impact:**
    - If broken, what's the impact on the customer?

### About Value for Test

- **Distinctness:**
    - Does this test provide new information?
- **Induction to Action:**
    - How quickly would this failure be fixed? (Would developers prioritize fixing it immediately?)

### About Cost-Efficiency

- **Quickness:**
    - How fast can this be scripted?
- **Ease:**
    - How easy will it be to script this?

### About History

- **Similar to Weak Areas:**
    - Volume of historical failures in related areas.
- **Frequency of Breaks:**
    - Volume of historical failures for this test.

By answering these questions, users can make informed decisions on whether to automate a specific scenario, considering
factors such as risk, value, cost-efficiency, and historical data.

## Project Inspiration

The idea to create this app comes from the insightful YouTube video
by [Angie Jones](https://www.youtube.com/watch?v=VL-_pnICmGY), a senior automation engineer at X (formerly Twitter).

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Git (optional)

### Installation

1. Clone the repository:
    ```bash
    git clone [repository_url]
    ```

2. Compile and run the main class:
    ```bash
    javac RegressionAutomationCandidate.java
    java RegressionAutomationCandidate
    ```

## Usage

1. Run the program, and follow the prompts to input test scenarios.
2. The program will assess each scenario based on predefined criteria and provide an automation score.
3. Results will be categorized as "Automated," "Possibly automated," or "Don't automate."

## Project Structure

- `AutomationCandidate.java`: Main class for executing the automation assessment.
- `Criteria.java`: Base class for defining criteria and asking questions.
- Other classes (`RiskToCustomer.java`, `ValueForTest.java`, `History.java`, `CostEfficiency.java`): Subclasses
  extending `Criteria` for specific criteria.

## License

This project is licensed under the [MIT License](LICENSE).
