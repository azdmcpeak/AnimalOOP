//Derek McPeak
//CSC161177 - Thursday nights
//Assignment 3



public abstract class Animal implements Comparable <Animal> {

        //String name for when an animal is constructed.
    protected String name;

    protected int age;



    // Default constructor for the animal class
    public Animal(){
    }

        // Main constructor for animal
    public Animal(String Thename, int age){
        this.age = age;
        this.name = Thename;

    }




        // Function for speak, to show when other classes access the Animal parent class.
    public abstract String speak();


    public void setage(int age){
        this.age = age;
    }


        // Setter for animal name
    public void setName(String name) {
        this.name = name;
    }


        // Getting for animal name
    public String getName() {
        return name;
    }

    public int getAge(){
        return this.age;
    }




        // Compare method comparing the two names of the then name"this.name"...
        // ...to the name passed to the object "a", to later be sorted alphabetically
    public int compareTo(Animal a){
        return this.name.compareTo(a.name);
    }

}
