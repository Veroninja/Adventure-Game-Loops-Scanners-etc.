//Adventure Game body code

import java.util.Scanner;
import java.util.*;

public class Game
{
    // instance variables - replace the example below with your own
    private String username;
    private int choice1;
    
    public static void main(String[] args)
    {
        List<String> invent = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        
        //ask for username
        System.out.println("Welcome. What is your name?");
        String username = sc.nextLine();
        
        //Greetings and game data
        System.out.println("Hello "+ username+".");
        GameData info = new GameData();
        
        while (true)
        {
            //choice 1 – direction
            System.out.println("Which direction would you like to go in? (1.F / 2.B / 3.L / 4.R) ");
            int choice1 = sc.nextInt();
            int choice2;
            
            //go to forest tower
            while (choice1 == 1)
            {
                System.out.println("You have chosen to go to the Forest Tower.");
                
                //check for food
                if (invent.contains("food"))
                {
                    System.out.println("You have food.");
                }
                else
                {
                    System.out.println("You have no food.");
                }
                
                //check for weapons
                if (invent.contains("weapons"))
                {
                    System.out.println("You have weapons.");
                }
                else
                {
                    System.out.println("You have no weapons.");
                }
                
                //choice 2 – y/n
                System.out.println("");
                System.out.println("You need both to survive. Do you still want to go forward? (1.Y / 2.N)");
                choice2 = sc.nextInt();
                    if (choice2 == 1)
                    {
                        if (invent.contains("food") && invent.contains("weapons"))
                        {
                            System.out.println("Congratulations! You have defeated the witch!");
                            System.out.println("End of program.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("You have been eaten by a creature in the forest. Game over.");
                            System.exit(0);
                        }
                    }
                    if (choice2 == 2)
                    {
                        System.out.println("Wise choice. You have returned to the starting point.");
                        System.out.println("");
                        System.out.println("");
                    }
                break;
            }
            
            //go to Pirate's Bay
            while (choice1 == 2)
            {
                System.out.println("You have chosen to go to Pirate's Bay.");
                
                //check for food
                if (invent.contains("food"))
                {
                    System.out.println("You have food.");
                }
                else
                {
                    System.out.println("You have no food.");
                }
                
                //check for weapons
                if (invent.contains("weapons"))
                {
                    System.out.println("You have weapons.");
                }
                else
                {
                    System.out.println("You have no weapons.");
                }
                
                //choice 2 – y/n
                System.out.println("");
                System.out.println("You need either to trade. Do you still want to go forward? (1.Y / 2.N)");
                choice2 = sc.nextInt();
                    if (choice2 == 1)
                    {
                        if (invent.contains("food"))
                        {
                            invent.remove("food");
                            invent.add("weapons");
                            System.out.println("You have traded food for weapons. Below is your updated inventory:");
                            System.out.println(invent);
                            System.out.println("You have returned to the starting point.");
                            System.out.println("");
                            System.out.println("");
                        }
                        if (invent.contains("weapons"))
                        {
                            invent.remove("weapons");
                            invent.add("food");
                            System.out.println("You have traded weapons for food. Below is your updated inventory:");
                            System.out.println(invent);
                            System.out.println("You have returned to the starting point.");
                            System.out.println("");
                            System.out.println("");
                        }
                        else
                        {
                            System.out.println("You have been killed by pirates due to your lack of goods to trade. Game over.");
                            System.exit(0);
                        }
                    }
                break;
            }
            
            //go to Abandoned mines
            while (choice1 == 3)
            {
                System.out.println("You have chosen to go to the Abandoned mines.");
                
                //check for food
                if (invent.contains("food"))
                {
                    System.out.println("You have food.");
                }
                else
                {
                    System.out.println("You have no food.");
                }
                
                //check for weapons
                if (invent.contains("weapons"))
                {
                    System.out.println("You have weapons.");
                }
                else
                {
                    System.out.println("You have no weapons.");
                }
                
                //choice 2 – y/n
                System.out.println("");
                System.out.println("You need food to survive. Do you still want to go forward? (1.Y / 2.N)");
                choice2 = sc.nextInt();
                    if (choice2 == 1)
                    {
                        if (invent.contains("food"))
                        {
                            invent.remove("food");
                            invent.add("weapons");
                            System.out.println("You found weapons, but used up food in the process. Below is your updated inventory:");
                            System.out.println(invent);
                            System.out.println("You have returned to the starting point.");
                            System.out.println("");   
                            System.out.println("");
                        }
                        else
                        {
                            System.out.println("You have starved in the mines due to your lack of food. Game over.");
                            System.exit(0);
                        }
                    }
                    if (choice2 == 2)
                    {
                        System.out.println("You have returned to the starting point.");
                        System.out.println("");
                        System.out.println("");
                    }
                break;
            }
            
            //go to Village
            while (choice1 == 4)
            {
                System.out.println("You have chosen to go to the Village.");
                
                //check for food
                if (invent.contains("food"))
                {
                    System.out.println("You have food.");
                }
                else
                {
                    System.out.println("You have no food.");
                }
                
                //check for weapons
                if (invent.contains("weapons"))
                {
                    System.out.println("You have weapons.");
                }
                else
                {
                    System.out.println("You have no weapons.");
                }
                
                //choice 2 – y/n
                System.out.println("");
                System.out.println("You don't need either. Do you still want to go forward? (1.Y / 2.N) ");
                choice2 = sc.nextInt();
                    if (choice2 == 1)
                    {
                        invent.add("food");
                        System.out.println("The villagers have given you food. Below is your updated inventory:");
                        System.out.println(invent);
                        System.out.println("You have returned to the starting point.");
                        System.out.println("");
                        System.out.println("");
                    }
                    if (choice2 == 2)
                    {
                        System.out.println("Very well. You have returned to the starting point.");
                        System.out.println("");
                        System.out.println("");
                    }
                break;
            }
        }
    }
}
