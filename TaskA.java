//Ethan Wong
//CS1400
//Assignment 3
//9.25.23


import java.util.Scanner;

public class TaskA {
    public static void main(String [] args)
    {
        int number;

        String commuter, onCampusHousing, offCampusHousing;
        commuter = "20,582";
        onCampusHousing = "28,110";
        offCampusHousing = "26,584"; // Test

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Costs of CPP Program");

        System.out.print("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing): ");
        number = keyboard.nextInt();

        double commuterTotal = 20582.0;
        double commuterPerMonth = commuterTotal / 12;
        double onCampusHousingTotal = 28108.0;
        double onCampusHousingPerMonth = onCampusHousingTotal / 12;
        double offCampusHousingTotal = 26584.0;
        double offCampusHousingPerMonth = offCampusHousingTotal / 12;

        switch(number)
        {
            case 1:
                String formatCommuter = String.format("Your total estimated cost is $" + commuter
                + " and your monthly cost is about $%.2f.", commuterPerMonth);
                System.out.println(formatCommuter);
                break;
            case 2:
                String formatOnCampus = String.format("Your total estimated cost is $" + onCampusHousing
                + " and your monthly cost is about $%.2f.", onCampusHousingPerMonth);
                System.out.println(formatOnCampus);
                break;
            case 3:
                String formatOffCampus = String.format("Your total estimated cost is $" + offCampusHousing
                + " and your monthly cost is about $%.2f.", offCampusHousingPerMonth);
                System.out.println(formatOffCampus);
                break;
        }
        System.out.println("Thanks for using the program!");
    }
}
