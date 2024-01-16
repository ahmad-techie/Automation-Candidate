# Regression Automation Project

## Overview
This Java project is designed to evaluate and automate regression testing scenarios based on predefined criteria. It incorporates user input for test scenarios and assigns automation scores using specific criteria for each scenario.

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
- Other classes (`RiskToCustomer.java`, `ValueForTest.java`, `History.java`, `CostEfficiency.java`): Subclasses extending `Criteria` for specific criteria.


