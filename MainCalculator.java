class Maincalculator{
    public static void main(String[] args){
System.out.print("Enter the first number: ");
   int firstNumber = sc.nextInt();
    // Enter the second number
   System.out.print("Enter the second number: ");
   int secondNumber = sc.nextInt();
 
   System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
   String operation = sc.next();
   int result = performOperation(firstNumber, secondNumber, operation);
   System.out.println("Your answer is: " + result);
}
public static int performOperation(int firstNumber, int secondNumber, String operation)
{
   int result = 0;
    // perform addition operation
   if (operation.equals("+")) {
       result = firstNumber + secondNumber;
   }
   // perform subtraction operation
   else if (operation.equals("-")) {
       result = firstNumber - secondNumber;
   }
   // perform multiplication operation
   else if (operation.equals("*")) {
       result = firstNumber * secondNumber;
   }
    // perform remainder operation
   else if (operation.equals("%")) {
       result = firstNumber % secondNumber;
   }
    // perform deivider operation
   else if (operation.equals("/")) {
       result = firstNumber / secondNumber;
   }
    // invalid operation
   else {
       System.out.println("Invalid operation");
   }
   return result;
    }
}
