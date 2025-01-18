import java.util.ArrayList;

public class M_myGeneric {
    public static void main(String[] args) {
        // The difference between both declareation is,

        ArrayList<Integer> n1 = new ArrayList<>(); 
        // used in old version java 7 or less
        
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        // used in new version java 7 or above
        
        // Although, Both doesn't change functoinality of the code. 
        // There no differec in working

        // however,case 1 provide more readability and less code.
    }
}
