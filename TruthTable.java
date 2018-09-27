import java.util.Scanner;
public class TruthTable
{
    // instance variables - replace the example below with your own
       
    public TruthTable()
    {
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean input1;
        boolean input2;
        int whichOperator;
        boolean keepGoing = true;
        
        while(true)
        {
            System.out.println("Howdy, I'm a truth table robot, please enter the first input (True/False):");
            input1 = sc.nextBoolean();
            //check if it is correct
            System.out.println("The first input value is: "+input1);
            System.out.println("Please enter the second input (True/False):");
            input2 = sc.nextBoolean();
            //check if it is correct
            System.out.println("The second input value is: "+input2);   
            
            //let user choose which logical operater to be used
            System.out.println("Which operator would you like to use? 1 for AND, 2 for OR");
            whichOperator = sc.nextInt();
            if (whichOperator == 1)
            {
                System.out.print("Output (AND operator): " +(input1 && input2));
            }else{
                System.out.print("Output (OR operator): " +(input1 || input2));
            }
            System.out.println("Do you want to continue? (True/False)");
            keepGoing = sc.nextBoolean();
        }
    }
}