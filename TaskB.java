//Ethan Wong
//CS1400
//Assignment 3
//9.25.23


import java.util.Scanner;

public class TaskB {
    public static void main(String [] args)
    {
        int number;

        double familySupport;
        double financialAid;
        double hourlyRate;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Costs of CPP Program");

        System.out.println("Please enter the amount of annual family support: ");
        familySupport = keyboard.nextDouble();

        System.out.println("Please enter the amount of annual financial aid/loan you are eligible for: ");
        financialAid = keyboard.nextDouble();

        System.out.println("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing):");
        number = keyboard.nextInt();

        System.out.println("Please enter your hourly rate:");
        hourlyRate = keyboard.nextDouble();

        double totalSupport = familySupport + financialAid;
        double commuter = (20582.0 - totalSupport) / 16;
        double commuterHoursNeeded = commuter / 30;
        double onCampusHousing = (28108.0 - totalSupport) / 16;
        double onCampusHousingHoursNeeded = onCampusHousing / 30;
        double offCampusHousing = (26584.0 - totalSupport) / 10;
        double offCampusHousingHoursNeeded = offCampusHousing / 30;

        switch (number)
        {
            case 1:
                if(commuterHoursNeeded <= 20) //Commuter hours
                {
                    String formatCommuter = String.format("You need to work %.2f hours per week " +
                    "based on the information entered.", commuterHoursNeeded);
                    System.out.println(formatCommuter);
                }
                else
                {
                    System.out.println("You can only work a maximum of 20 hours per week. You are over the limit.");
                }
                break;
            case 2:
                if(onCampusHousingHoursNeeded <= 20)
                {
                    String formatOnCampus = String.format("You need to work %.2f hours per week " +
                    "based on the information entered.", onCampusHousingHoursNeeded);
                    System.out.println(formatOnCampus);
                }
                else
                {
                    System.out.println("You can only work a maximum of 20 hours per week. You are over the limit.");
                }                
                break;
            case 3:
                if(offCampusHousingHoursNeeded <= 20)
                {
                    String formatOffCampus = String.format("You need to work %.2f hours per week " +
                    "based on the information entered.", offCampusHousingHoursNeeded);
                    System.out.println(formatOffCampus);
                }
                else
                {
                    System.out.println("You can only work a maximum of 20 hours per week. You are over the limit.");
                }
                break;
        }
    }
}