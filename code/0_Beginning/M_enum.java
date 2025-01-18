// In java enumared types(enums) is special data type used to define collection of constants. like date, months, weeks etc..
// varible inside enum are by default "public static final"
// generally used with switch case statements


enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


// enum can have filed, method, constructor
enum Day2 {
    // Assign values to enum constants for that we need to define constructor.
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);


    // each enum constant can have fileds(property like class)
    private int value;

    // constructor
    // "this" refers to enum constant
    Day2(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}


// eun constant can have more than one property
enum Vehical{
    CAR(120,"Gas"),
    BIKE(80,"Petrol");

    private int speed;
    private String fuelType;

    Vehical(int speed,String fuelType){
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void display(){
        System.out.println(this.name() + " "+ this.speed +" "+ this.fuelType );
        // this.name() refers constant's name
    }

}


public class M_enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        Day2 d2 = Day2.MONDAY;
        System.out.println( d2 +" " + d2.getValue() );


        System.out.println(Vehical.values()[0]); // Vehical.values() returns an array of all enum constants

        // loop over all enums
        // for(Vehical v : Vehical.values()){
        //     v.display();
        // }



    }
}


// Notice, Here we use constructor in Day2 enum but we have not used the "new" keyword.
// when enum constants are defined the constructor is automatically invoke implicitly. That's why Unlike regular classes we don't need to invoke constructor. Therefore, there is no need of 'new' keyword
// for each constant automatically constructor is called inside the enum

// Each enum constant is a unique instance, and the JVM ensures there is only one instance for each constant (like a singleton pattern). The enum constants are automatically instantiated during class loading, so there is no need for you to create new instances explicitly using the new keyword.
//  Since the enum constants are predefined, the Java runtime ensures they are created once and reused, preventing unnecessary object creation. increase efficiency
// internally JVM will execute like this, Vehicle CAR = new Vehicle(120, "Gasoline");


// same way internally Vehical.values()  (though the actual implementation is more complex.)

// public static Vehicle[] values() {
//    return new Vehicle[]{CAR, BIKE, TRUCK};  
// }

// return type array and returning array