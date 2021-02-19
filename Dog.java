//Derek McPeak
//CSC161177 - Thursday nights
//Assignment 3



public class Dog extends Animal implements Trainable {

        // Object for breed of dog
    private String Breed;
        // Object for the color of the dog
    private String PrimaryColor;
        // Object for the size of the Dog
    private String Size;


        // default constructor for the dog class
    public Dog() {

    }

        //Primary Constructor for the Dog class.
        //calling parent speak to show it is called first
        //Print statments for each object to show when they are called.
    public Dog(String Breed, String PrimaryColor, String Size, String name, int age){
            // setting the parent animal name
        super(name,age);
            // setting the parent animal age
            // System.out.println("Setting Breed...");
        this.Breed = Breed ;
            // System.out.println("Setting PrimaryColor...");
        this.PrimaryColor = PrimaryColor;
            //System.out.println("Setting Size...");
        this.Size = Size;



    }

        // Setter for breed
        // print statement to show when its being called.
    public void setBreed(String breed) {
        //System.out.print("Setting Breed...");
        this.Breed = breed;
    }

        // Setter for PrimaryColor
        // print statement to show when its being called.
    public void setPrimaryColor(String primaryColor) {
        //System.out.print("Setting PrimaryColor...");
        this.PrimaryColor = primaryColor;
    }

        // Setter for Size
        // print statement to show when its being called.
    public void setSize(String size) {
        //System.out.print("Setting Size...");
        this.Size = size;
    }

        // Getter for breed
    public String getBreed() {
        return this.Breed;
    }

        // Getter for Color
    public String getPrimaryColor() {
        return this.PrimaryColor;
    }

        // Getter for Size
    public String getSize() {
        return this.Size;
    }


        //Function for the animal to speak.
        //Print statement for breed, color & size
    @Override
    public String speak(){
        System.out.println("Breed: " + this.Breed + "\nName: "+ super.name + "\nPrimary Color: " +this.PrimaryColor + "\nSize: " + this.Size);
        return "Bork Bark";

    }


    @Override
        //Trainable method, giving examples of wha the animal can be trained to do.
        //overrides method in Trainable interface
    public void isTrainable(){
        System.out.println("I can be trained! Like sit, stay and lay. ");
    }


        // to string constructor for dog
    public String toString(){
        return "Breed: " + this.Breed + "\nName: "+ super.name + "\nPrimary Color: " +this.PrimaryColor + "\nSize: " + this.Size + "\nAge: " + super.age;
    }


}
