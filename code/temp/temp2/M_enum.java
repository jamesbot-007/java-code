




enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}



enum Day2 {
    
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);


    
    private int value;

    
    
    Day2(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}



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
        
    }

}


public class M_enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        Day2 d2 = Day2.MONDAY;
        System.out.println( d2 +" " + d2.getValue() );


        System.out.println(Vehical.values()[0]); 

        
        
        
        



    }
}








