# DigitalWalletTracker

##  Project Overview

Digital Wallet Tracker is a console-based Java application designed to help users manage their personal finances efficiently. The application allows users to track income and expenses, categorize transactions, set budget limits, and generate reports for specific time periods.

This project is built using core Java concepts and follows a modular architecture with proper separation of concerns (Model, Service, UI).

---

##  Features

###  1. User Authentication

* Simple login using username and PIN
* Personalized greeting for user

---

###  2. Profile Dashboard

* Displays:

  * Total Income
  * Total Expenses
  * Current Balance
  * Savings
  * Exceeded Expenses

---

###  3. Transaction Management

#### ➤ Add Expense

* Enter:

  * Amount
  * Category (Food, Travel, etc.)
  * Payment Mode (Cash, UPI, Card)
  * Description
  * Date & Time (auto-generated)

#### ➤ Add Income

* Enter income amount and source

#### ➤ View Transactions

* View all transactions
* Filter transactions by category

---

###  4. Report Generation

* Generate reports based on custom date range
* Displays all transactions within selected period
* Calculates total expense for that duration

---

###  5. Budget Management (Monthly Expense Splitter)

* Set budget limits for each category
* Tracks spending per category
* Alerts when:

  * Near limit 
  * Budget exceeded 

---

###  6. Summary Page

* Displays:

  * Total Income
  * Total Expenses
  * Remaining Balance
* Helps analyze spending patterns

---

##  Tech Stack

* Java (Core Java, OOP)
* Collections Framework (ArrayList, HashMap)
* Java Time API (LocalDate, LocalDateTime)
* Console-based UI (Scanner)

---

##  Project Structure

```
DigitalWalletTracker/
│
├── model/      # Data classes
├── service/    # Business logic
├── util/       # Utility classes
├── ui/         # User interface (console)
├── Main.java   # Entry point
```

---

##  How to Run

### Step 1: Compile

```
javac model/*.java service/*.java util/*.java ui/*.java Main.java
```

### Step 2: Run

```
java Main
```

---

##  Key Concepts Used

* Object-Oriented Programming (OOP)
* Abstraction (Transaction class)
* Encapsulation (User, Budget)
* Collections for data storage
* Modular architecture (Separation of concerns)

---

##  Future Enhancements

* File storage (Save transactions permanently)
* GUI using JavaFX
* Database integration (MySQL)
* Data visualization (charts & analytics)

---

##  Conclusion

This project demonstrates a real-world implementation of a personal finance tracker using Java. It highlights strong understanding of OOP, data handling, and application design, making it suitable for academic submissions and internship portfolios.

---
