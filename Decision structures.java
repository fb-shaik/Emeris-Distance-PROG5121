Decision structures (also called selection statements) control the flow of execution based on conditions

1. if Statement - Executes a block only if a condition is true.

Syntax:
if (condition) {
    // code to execute if condition is true
}

int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
}

2. if-else Statement - Provides an alternative block if the condition is false.

Syntax:
if (condition) {
    // true block
} else {
    // false block
}

int age = 16;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

3. Nested if - An if inside another if
Syntax: 
if (condition1) {
    if (condition2) {
        // inner block
    }
}

int age = 20;
boolean hasID = true;
if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    }
}

4. switch Statement - Used for selecting one of many options based on a variable.
Syntax: 
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}

int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

