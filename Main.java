//Derek McPeak
//CSC161177 - Thursday nights
//Assignment 3


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

            //creating scanner
        Scanner input = new Scanner(System.in);

            //Calling constructor for Dog, with variables
            //Print Statement for readability in the terminal
        Dog D = new Dog("","","","",0);
        System.out.println(" ");

            //Calling constructor for Bird, with variables
            //Print Statement for readability in the terminal
        Bird B = new Bird("","","",0);
        System.out.println(" ");

            //Print statement for the speak method in Dog class
            //Print Statement for readability in the terminal
        //test for printing the dog animal
        //System.out.println(D.speak());
        System.out.println(" ");

            //Print statement for the speak method in Bird class
            //Print Statement for readability in the terminal
            //test for printing the bird animal
       //System.out.println(B.speak());

            // spacer for speak functions to improve readability
        //System.out.println();

            //arraylist for animal.
        ArrayList<Animal> TheAnimals = new ArrayList<>();

            //count for while loop
        int count = 0;

            //while loop for creating 5 animals.
            //asks to create dog or bird
        while(count < 2){
            System.out.println("Would you like to create a dog, a bird, or exit");
            String _response = input.nextLine();
            String userinput = _response.toUpperCase();

            if (userinput.equals("DOG")){
                System.out.println("Lets create a dog! You will need to give a Breed type, Fur color, Size and Name.");
                System.out.println("Breed: ");
                String Breed_response = input.nextLine();
                D.setBreed(Breed_response);

                System.out.println("Fur Color: ");
                String FC_response = input.nextLine();
                D.setPrimaryColor(FC_response);

                System.out.println("Size: ");
                String Size_response = input.nextLine();
                D.setSize(Size_response);

                System.out.println("Name: ");
                String Name_response = input.nextLine();
                D.setName(Name_response);

                System.out.println("Age: ");
                int Age_response = input.nextInt();
                D.setage(Age_response);

                //adding new dog to TheAnimals arraylist
                TheAnimals.add(new Dog(Breed_response, FC_response, Size_response,Name_response,Age_response));

                // increasing count by 1 for the while loop
                count++;
            }
            else if(userinput.equals("BIRD")){
                System.out.println("Seems like were gonna make a meep meep bird. Were going to need, Feather color, beak type and name.");
                //assigning variables to attributes, then assigning those attributes...
                //... to the arguments in the dog/bird constructor
                System.out.println("Feather Color: ");
                String Fethcolor = input.nextLine();

                System.out.println("Beak type: ");
                String BT = input.nextLine();

                System.out.println("Name: ");
                String BName = input.nextLine();
                //adding new bird to TheAnimals arraylist

                System.out.println("Age: ");
                Integer Bage = input.nextInt();


                TheAnimals.add(new Bird(Fethcolor,BT, BName, Bage));

                //increasing count by 1
                count++;
            }
            else {
                System.out.println("Please enter a valid option.");
                break;
            }

        }

            //Sorting TheAnimals in alphabetical order
            //checking the two animals to see if they have an instance of...
            //..."isTrainable" in their class, if so, printing it.
        Collections.sort(TheAnimals);



        for (int i = 0; i<TheAnimals.size(); i++) {
            System.out.println(TheAnimals.get(i));
            if(TheAnimals.get(i) instanceof Trainable){
                ((Trainable)TheAnimals.get(i)).isTrainable();
            }
            System.out.println(" ");
        }





    }
}
