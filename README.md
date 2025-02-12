# Study of Automated Tests in Java

## TDD and BDD
TDD (Test-Driven Development) and BDD (Behavior-Driven Development) are software development approaches that focus on testing, but they have different goals and methods.

### TDD (Test-Driven Development)
- TDD is a coding practice where you **write tests before writing the actual code**.
- The process follows a Red-Green-Refactor cycle:
  - Red: Write a failing test (since the feature doesn’t exist yet).
  - Green: Write the minimum code needed to pass the test.
  - Refactor: Improve the code while keeping the test passing.
- The goal is to ensure code is correct, reliable, and maintainable.
- It focuses on the smallest units of code (like functions or methods).

### BDD (Behavior-Driven Development)
- BDD extends TDD by focusing on the behavior of the software from the user's perspective.
- Tests are written in plain language (often using tools like Cucumber) to describe how a feature should work.
- The goal is to improve collaboration between developers, testers, and business stakeholders.

### Key Difference
TDD is more technical and focuses on testing individual pieces of code.
BDD is more about user behavior and making sure the system does what the business expects.

## JUnit
JUnit is a **testing framework** for Java that helps developers write and run automated tests. It is mainly used for unit testing, which means testing small parts of the code (like methods and classes) to make sure they work correctly.

## Selenium
Selenium for Java is a tool that helps automate web browsers. It allows you to write Java code to control a browser, just like a human would—clicking buttons, filling out forms, navigating pages, and more. Developers and testers use Selenium to check if a website works as expected by simulating real user actions.
