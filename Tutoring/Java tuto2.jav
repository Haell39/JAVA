
/*
* Java Variables
*
* In Java, a variable is a named storage location for a value of a particular data type.
* The variable is declared with a data type, and the value stored in the variable is of that type.
* The variable is given a name that is a sequence of one or more letters, digits, and/or _ (underscore)
* The variable name should start with a letter, not with a digit.
* The variable name should be descriptive of the value it contains.
*/

// integer variable
int age = 20;

// floating point variable
float pi = 3.14f;

// string variable
String name = "rafael";

// boolean variable
boolean isOpen = true;

// array variable
int[] numbers = {1, 2, 3};

// object variable
Circle circle = new Circle(10, 10, 5);

// Accessing variable values
System.out.println("age = " + age);
System.out.println("pi = " + pi);
System.out.println("name = " + name);
System.out.println("isOpen = " + isOpen);
System.out.println("numbers = " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
System.out.println("circle = " + circle.toString());

// Changing variable values
age = 21;
pi = 3.1415;
name = "rafaela";
isOpen = false;
numbers[0] = 5;
numbers[1] = 10;
numbers[2] = 15;
circle.setX(20);
circle.setY(20);
circle.setRadius(10);

// Accessing variable values again
System.out.println("age = " + age);
System.out.println("pi = " + pi);
System.out.println("name = " + name);
System.out.println("isOpen = " + isOpen);
System.out.println("numbers = " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
System.out.println("circle = " + circle.toString());

