package company;
// Note : if you have mulitple java files then you can ru like,
// javac -d . file1.java file2.java file3.java

public class File3 {
    public int a = 10;
    public static void main(String[] args) {
        System.out.println("Print");
    }
}

// compile and put all compiled files by creating a company directory
// javac -d . .\File3.java

// when you have your custom package that time you need to specify that thing to the java runtime(java) 
// java company.File3  