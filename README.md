# Java Capstone Project: Peso-Dollar Currency Converter

**Author:** Tampos, Redney
**Course:** Programming Logic and Design
**Instructor:** Engr. Jamie Eduardo Rosal, MSCpE

---

## I. Problem Statement
Travelers, online shoppers, and finance students often struggle to perform quick and accurate exchange rate calculations between the Philippine Peso (PHP) and the US Dollar (USD). Furthermore, standard calculators do not keep a record of previous transactions, making it difficult to compare recent conversions.

This project addresses this problem by providing a user-friendly **Currency Converter Application** that not only performs accurate conversions but also maintains a **"Recent History" log** of the last 5 transactions using array-based logic.

---

## II. Program Features
* **Bi-Directional Conversion:**
    * Convert Philippine Peso (PHP) to US Dollar (USD).
    * Convert US Dollar (USD) to Philippine Peso (PHP).
* **Transaction History:**
    * Automatically saves and displays the last 5 calculations.
    * Uses a First-In-First-Out (FIFO) logic to manage the history log.
* **Error Handling:**
    * Prevents system crashes by detecting invalid inputs (e.g., letters or symbols) and displaying a user-friendly error message.
* **Graphical User Interface (GUI):**
    * Built with Java Swing for an intuitive user experience.

---

## III. Technical Highlights (Code Structure)
This project satisfies the course technical requirements through the following implementations:

1.  **OOP (Object-Oriented Programming):**
    * The logic is encapsulated in a separate class named `CurrencyMath`.
    * Uses constructors and private attributes for data security.
2.  **Methods:**
    * Calculations are performed inside specific methods (`convertToDollar`, `convertToPeso`), ensuring modularity.
3.  **Arrays & Loops:**
    * **Array:** A String array (`String[] history`) of size 5 stores the transaction logs.
    * **Loop:** A `for-loop` is used to shift array elements when the history is full, and another loop is used to traverse the array for display purposes.
4.  **Conditional Structures:**
    * Uses `if-else` statements to determine the conversion type selected by the user.

---

## IV. How to Run the Program
1.  **Prerequisites:**
    * Install **Apache NetBeans IDE** (or any Java IDE).
    * Ensure **JDK (Java Development Kit)** is installed.
2.  **Installation:**
    * Download the project files or clone the repository.
    * Open Apache NetBeans.
    * Go to `File` > `Open Project` and select `CurrencyConverter_[LastName]`.
3.  **Execution:**
    * Navigate to `MainFrame.java` in the Source Packages.
    * Right-click the file and select **Run File** (Shift + F6).
4.  **Usage:**
    * Enter a numeric amount in the text field.
    * Select the conversion type from the dropdown menu.
    * Click the **Convert** button.
    * View the result and the updated history log below.

---

## V. Sample Output
<img width="863" height="909" alt="image" src="https://github.com/user-attachments/assets/de8df66a-ba66-458b-90f2-c5d4b567bccf" />
<img width="619" height="898" alt="image" src="https://github.com/user-attachments/assets/d690a051-85b0-45bc-8ebf-1399c8da9835" />



[PLEASE UPLOAD A SCREENSHOT OF YOUR RUNNING APP HERE IN GITHUB]
