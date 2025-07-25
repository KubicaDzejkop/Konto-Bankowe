# Bank System – Java

**Simple bank account simulator written in Java.**

## Overview

- Manage a bank account: deposit, withdraw, check balance
- Verify bank account number (Polish standard – 26 digits)
- Create a term deposit and calculate interest

## Main Classes

- **`BankAccount`** – Represents a bank account. Handles account number, balance, deposits, and withdrawals.
- **`TermDeposit`** – Represents a term deposit. Allows creating a deposit for a set time and interest rate, and calculates its profit.
- **`Main`** – Demo usage. Shows how to create an account, deposit/withdraw funds, and open a term deposit.

## Features

- **Account number validation:** Must be 26 digits (Polish standard), auto-padded with zeros if shorter.
- **Balance protection:** Balance cannot be negative.
- **Deposit and withdrawal:** Add or subtract funds from the balance.
- **Term deposit:** Lock funds for a set period and interest; profit added after term ends.

## Sample Output

```
Account number is valid
Account number: 111222333444555666777888000 , balance: 5000.0
Your account number: 111222333444555666777888000
0.0
Balance after deposit: 500.0
Balance after withdrawal: 1500.0
Account balance after opening term deposit: -500.00
Please wait 2 minutes and then type 'stop'
...
Balance after term deposit: 166.67
```

---

## How to Run This Application

1. **Clone the repository**
    ```
    git clone https://github.com/<your-username>/<repository-name>.git
    ```

2. **Open the project in your favorite Java IDE**
    - For example: IntelliJ IDEA, Eclipse, NetBeans

3. **Make sure you have Java 8 or newer installed**

4. **Run the `Main` class**
    - This will launch the console app and demonstrate basic operations.

---

> **Note:**  
> This project is for educational purposes and demonstrates basic object-oriented programming in Java.  
> No security or advanced validation is implemented.
