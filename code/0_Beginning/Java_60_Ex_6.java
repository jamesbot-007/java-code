// create calculator

class InvalidInputExpression extends Exception {
    @Override
    public String toString() {
        return "Invalid input";
    }

    @Override
    public String getMessage() {
        return "Input not should be no. 8 or 9";
    }
}
class MaxInputExpression extends Exception {

    private String message;
    MaxInputExpression(String message) { 
        super(message);
        this.message = message;
    }
    @Override
    public String toString() {
        return "Invalid input " + this.message;
    }

    @Override
    public String getMessage() {
        return "Input not should be greater than 100000" ;
    }
}

class CustomCalculator {

    private double x;
    private double y;
  
    CustomCalculator(double x, double y) throws InvalidInputExpression, ArithmeticException, MaxInputExpression
    {
        if((x==8)||(y==9)){
            throw new InvalidInputExpression();
        }
        else if(y==0){
            throw new ArithmeticException("Can not divide by zero");
        }
        else if ((x>100000)||(y>100000)){
            throw new MaxInputExpression("Number is greater than 100000");
            
        }

        this.x = x;
        this.y = y;
    }

    double add() throws InvalidInputExpression
    {
      // if method has "throws" in signature then it is not mandatory to throw and exeception  
        return x+y;
    }
    double sub(){
        return x-y;
    }
    double mul(){  
        return x*y;
    }
    double div() {
        return x/y;
    }



}

public class Java_60_Ex_6 {
    public static void main(String[] args)  {
        try{
            CustomCalculator c = new CustomCalculator(1,2);
            // CustomCalculator c1 = new CustomCalculator(1,9);
            // CustomCalculator c2 = new CustomCalculator(17,0);
            CustomCalculator c2 = new CustomCalculator(790,2345678);
            
            System.out.println(c.add());
        }
        // Catching different expression behind reason is to handle them in different ways
        catch (InvalidInputExpression e){
            System.out.println(e.toString());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(MaxInputExpression e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
