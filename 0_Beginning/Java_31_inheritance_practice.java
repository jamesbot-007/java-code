
class Circle {
    public int radius ;

    Circle(){
        System.out.println("This is default constructor of Circle class");
    }

    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI + this.radius + this.radius ;
    }

}

class Cylinder extends Circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        // if we don't use the super() then the default constructor will run

        this.height = h;
    }


    public double volume(){
        return super.area() + this.height ;
    }


}


class Rectangle{
    private float length;
    private float width ;

    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    float getLength(){
        return this.length;
    }
    void setLength(int length){
        this.length = length;
    }

    float getWidth(){
        return this.width;
    }
    void setWidth(int width){
        this.width = width;
    }

    public float area(){
        return length * width ;
    }
}

class Cuboid extends Rectangle{
    // private float length;
    // private float width ;
    // if we're using length and width from above class then don't need to decalre it in derived class

    private float height ;
    
    
    Cuboid(float length,float width, float height ){
        super(length,width);
        this.height = height;
        
    }

    float getHeight(){
        return this.height;
    }
    void setHeight(int height){
        this.height = height;
    }
    
    public float area(){
        
        float lw = super.getLength()*super.getWidth();
        float wh = super.getWidth()*this.height;
        // float wh = super.getWidth()*this.getHeight(); // same as above line
        float lh = super.getLength()*this.height;

        return (2*(lw + wh + lh));
    }
}


public class Java_31_inheritance_practice {
    public static void main(String[] args) {

        // Cylinder
        Cylinder c = new Cylinder(12, 4);
        System.out.printf( "%.2f",c.volume() );
        System.out.println();


        // Cuboid 
        Cuboid rc = new Cuboid(12, 23, 4);
        System.out.println(rc.area() + "cm^2");

        // System.out.println(rc.getLength());
        // System.out.println(rc.getWidth());
        // System.out.println(rc.getHeight());
    }
}
