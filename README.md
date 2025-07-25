<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Bank System – Java</title>
  <style>
    body {
      font-family: 'Segoe UI', Arial, sans-serif;
      background-color: #f6f8fa;
      color: #24292f;
      margin: 0;
      padding: 2rem;
    }
    h1 {
      color: #0366d6;
      font-size: 2.5rem;
      margin-bottom: 0.5em;
    }
    h2, h3 {
      color: #22863a;
      margin-top: 2em;
      margin-bottom: 0.5em;
    }
    .container {
      background: #fff;
      border-radius: 10px;
      box-shadow: 0 2px 8px #e1e4e8;
      padding: 2rem 3rem;
      max-width: 850px;
      margin: auto;
    }
    code, pre {
      background-color: #eaecef;
      border-radius: 4px;
      padding: 0.2em 0.5em;
      font-family: 'Fira Mono', 'Consolas', monospace;
    }
    ul {
      margin-left: 1.5em;
    }
    .guide {
      background: #f0fff4;
      border-left: 6px solid #28a745;
      padding: 1em 1.5em;
      margin-top: 2em;
      border-radius: 6px;
    }
    .note {
      background: #fff7e6;
      border-left: 6px solid #ffb800;
      padding: 1em 1.5em;
      margin-top: 1em;
      border-radius: 6px;
    }
    .footer {
      margin-top: 2em;
      font-size: 0.95em;
      color: #6a737d;
    }
    a {
      color: #0366d6;
      text-decoration: none;
    }
    a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>Bank System – Java</h1>

    <p>
      <b>Simple bank account simulator written in Java.</b>  
    </p>

    <h2>Overview</h2>
    <ul>
      <li>Manage a bank account: deposit, withdraw, check balance</li>
      <li>Verify bank account number (Polish standard – 26 digits)</li>
      <li>Create a term deposit and calculate interest</li>
    </ul>

    <h2>Main Classes</h2>
    <ul>
      <li>
        <b><code>BankAccount</code></b> &mdash; Represents a bank account.<br>
        Handles account number, balance, deposits, and withdrawals.
      </li>
      <li>
        <b><code>TermDeposit</code></b> &mdash; Represents a term deposit.<br>
        Allows creating a deposit for a set time and interest rate, and calculates its profit.
      </li>
      <li>
        <b><code>Main</code></b> &mdash; Demo usage.<br>
        Shows how to create an account, deposit/withdraw funds, and open a term deposit.
      </li>
    </ul>

    <h2>Features</h2>
    <ul>
      <li><b>Account number validation:</b> Must be 26 digits (Polish standard), auto-padded with zeros if shorter.</li>
      <li><b>Balance protection:</b> Balance cannot be negative.</li>
      <li><b>Deposit and withdrawal:</b> Add or subtract funds from the balance.</li>
      <li><b>Term deposit:</b> Lock funds for a set period and interest; profit added after term ends.</li>
    </ul>

    <h2>Quick Start Guide</h2>
    <div class="guide">
      <ol>
        <li>
          <b>Clone the repository</b><br>
          <code>git clone https://github.com/&lt;your-username&gt;/&lt;repository-name&gt;.git</code>
        </li>
        <li>
          <b>Open the project in your favorite Java IDE</b><br>
          (e.g. IntelliJ IDEA, Eclipse, NetBeans)
        </li>
        <li>
          <b>Ensure you have Java 8 or newer installed</b>
        </li>
        <li>
          <b>Run the <code>Main</code> class</b><br>
          This will launch the console app and demonstrate basic operations.
        </li>
      </ol>
    </div>

    <h3>Sample Output</h3>
    <pre>
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
    </pre>

    <div class="note">
      <b>Note:</b>  
      This project is for educational purposes and demonstrates basic object-oriented programming in Java.  
      <br>
      No security or advanced validation is implemented.
    </div>

    <div class="footer">
      &copy; 2025 Simple Bank System Demo
    </div>
  </div>
</body>
</html>
