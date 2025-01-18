
// class smartphone extends Phone implements Camera, Bluetooth,GPS {}
// Smartphone is Phone which can act as Camera, Bluetooth, GPS. this polymorphism. One things mulitple forms.

// When we're using phone as camera that time we create camera as reference object of smartphone
// that time we restrict the smartphone in such way so that it can only act as camera. can not use other functionalities.
// For we do something like this, Camera c = new smartphone();
// Due to referece is of camera we can not call those method which are not present in camera.

interface Camera {

    void click();
    void video();

}
interface GPS {
    void currentLocation();
}
interface Bluetooth {
    void connect();
}

class Phone{
    int functionalities  = 3;
}

class smartphone extends Phone implements Camera, GPS, Bluetooth {
    public void click() {
        System.out.println("click");
    }
    public void video() {
        System.out.println("video");
    }

    public void currentLocation() {
        System.out.println("current location");
    }   

    public void connect() {
        System.out.println("connect");
    }

    // smartphon's own method
    void getFunctionality() {
        System.out.println("Functionality : " + functionalities);
    }
}

public class Java_36_Polymorphism {
    public static void main(String[] args) {

        // Creating object of smartphone
        // this way we can use all functionalities of smartphone means we can use all methods of smartphone.
        // smartphone s = new smartphone(); 

        // use Dynamic method dispatch
        Camera s = new smartphone(); // use smartphone as camera
        s.click();
        s.video();

        // s.currentLocation(); // Run time error
        // s.connect(); // Run time error
        // s.getFunctionality(); // even can not access smartphone's own method

        // only can access methods present/listed in Camera interface 


        GPS s2 = new smartphone(); // use smartphone as GPS
        s2.currentLocation();

        // s2.click(); // Run time error


    }
}
