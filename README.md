# CS366 — PA02: Karatsuba Multiplication

Starter project for Programming Assignment 02. Implement recursive Karatsuba multiplication for signed `BigInteger` values.

The complete assignment handout and due date are posted on Kodiak. Kodiak is authoritative if this README and the handout ever differ.

## Work in a Codespace

Open this repository on GitHub, choose **Code**, select **Codespaces**, and create a Codespace. The included dev-container configuration supplies Java 21. A GitHub account and Codespaces are optional.

## Work locally

Clone the repository, or use GitHub's **Download ZIP** option and extract it. Install a Java 21 JDK, then run:

```bash
./gradlew test
./gradlew run
```

On Windows, use `gradlew.bat test` and `gradlew.bat run`.

## Files to complete

- `src/main/java/edu/wne/cs366/KaratsubaMultiplier.java` — implement the required public method and private helpers.
- `src/test/java/edu/wne/cs366/StudentKaratsubaTest.java` — add at least six focused tests.

Do not change the package, class name, public method signature, Gradle configuration, or supplied tests. The supplied tests cover representative behavior but are not a complete specification.

## Download your work from Codespaces

You do not need to commit or push your work. Open a terminal at the project root and run:

```bash
zip -r submission.zip . -x 'submission.zip' '.git/*' '.gradle/*' 'build/*'
```

Locate `submission.zip` in the Explorer, right-click it, and select **Download...**. Open the ZIP and confirm that it contains your completed source and test files, then submit it through Kodiak.
