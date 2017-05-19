/**
 * Created by brianmullin on 5/16/17.
 */

import java.util.Scanner;
public class App {

    public static void main(String[] args){

        Scanner input = new Scanner();

        PhoneBook book = new PhoneBook();

        System.out.println("Welcome to the Phone Book database.\n" +
                "What would you like to do?\n" +
                "1. Search by name\n" +
                "2. Search by number\n" +
                "3. Enter new contact information\n" +
                "4. Delete contact information\n" +
                "Enter the number associated with the function you want to perform:");

        int choice = input.nextInt();
        switch (choice){
            case 1: System.out.println("Enter the name you would like to search for:");
                    String name =



        }

        book.addEntries("brian", "1800");

        System.out.println(book.lookUpByName("brian"));
    }
}
