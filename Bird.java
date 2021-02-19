//Derek McPeak
//CSC161177 - Thursday nights
//Assignment 3


public class Bird extends Animal implements Trainable {

        // Object for Feather color
    private String FeatherColor;
        // Object for Beak
    private String BeakType;



        //Default constructor for bird.
    public Bird(){
    }

        //Primary constructor for bird
        //calling parent speak to show it is called first
        //Print statements for each object to show when they are called.
    public Bird(String FeatherColor, String BeakType, String name, int age){
        super(name,age);
        //System.out.println("Setting FeatherColor...");
        this.FeatherColor = FeatherColor;
        //System.out.println("Setting Beaktype...");
        this.BeakType = BeakType;
    }

        //Getter for feather color
    public String getFeatherColor() {
        return FeatherColor;
    }

        // Setter for feather color
    public void setFeatherColor(String featherColor) {
        FeatherColor = featherColor;
    }

        // setter for beak type
    public void setBeakType(String beakType) {
        BeakType = beakType;
    }

        // getter for beaktype
    public String getBeakType() {
        return BeakType;
    }


        //Function for the animal to speak.
        //Print statement for feather color and beaktype.
    @Override
    public String speak(){
        System.out.println("Feather Color: " +  this.FeatherColor + "\nName: "+ super.name + "\nBeakType: " + this.BeakType);
        return "Tweet Tweet";
    }

    @Override
        //Trainable method, giving examples of wha the animal can be trained to do.
        //overrides method in Trainable interface
    public void isTrainable(){
        System.out.println("I can be trained! Like being trained to speak or kiss.");
    }

        // to string constructor for bird
    public String toString(){
        return "Feather Color: " + this.FeatherColor + "\nBeak Type: " + this.BeakType +"\nName: " + this.name + "\nAge: " + super.age;
    }


}
