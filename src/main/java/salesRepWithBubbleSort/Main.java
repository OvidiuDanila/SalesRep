package salesRepWithBubbleSort;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static Sales sales = new Sales();


    public static void main(String[] args) {

       /* for(int i=1;i<=3;i++) {
            addNewSalesRep();
        }

        sales.listSalesRep();

        ArrayList<SalesRepresentative> listOfSalesRepresentatives = sales.getSalesRepList();
        sales.sort(listOfSalesRepresentatives);
        System.out.println("Sales representatives in descending order: ");
        sales.listSalesRep();*/

        boolean quit = false;
        printOptions();
        while(!quit) {
            System.out.println("\npress 0 to exit! press 4 for list of available options\n Enter option:");
            int option = s.nextInt();
            s.nextLine();

            switch (option) {
                case 1:
                    addNewSalesRep();
                    break;
                case 2:
                    sales.listSalesRep();
                    break;
                case 3:
                    sales.sort(sales.getSalesRepList());
                    System.out.println("Sales representatives in descending order: ");
                    sales.listSalesRep();
                    break;
                case 4:
                    printOptions();
                    break;
                case 0:
                    System.out.println("Application closed!");
                    quit=true;
                    break;
                default:
                    System.out.println("Not an available option");
            }
        }

    }


    public static void printOptions() {
        System.out.println("Available options:");
        System.out.println("0 - to exit menu\n" +
                            "1 - to add sales representative\n" +
                            "2 - to list sales representatives\n" +
                            "3 - to sort sales representatives in descending order\n" +
                            "4 - print a list of available options.");
    }


    private static void addNewSalesRep() {
        System.out.println("\nEnter the name of the sales representative: ");
        String name = s.next();
        System.out.println("Enter number of sales: ");
        int numberOfSales = s.nextInt();
        System.out.println("Enter quota: ");
        double quota = s.nextDouble();
        SalesRepresentative newSalesRepresentative = SalesRepresentative.createSalesRep(name, numberOfSales, quota);
        if(sales.addNewSalesRep(newSalesRepresentative)) {
            System.out.println("Added " + name + " with " + numberOfSales + " sales of " + quota + ". Total: " + numberOfSales*quota);
        }
        else {
            System.out.println(name + " is already on the list!");
        }
    }
}
