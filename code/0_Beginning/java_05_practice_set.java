
public class java_05_practice_set {
    public static void main(String[] args) {
    // Find CGPA
    int s1 = 45;
    int s2 = 95;
    int s3 = 48;

    // All subject are out of 100. and CGPA comes out of 10
    // Fist we calculate avg. of all then divide by 10 so we avg. for all subject out of 10.

    // percentage out of 100
    float percentage = ((s1+s2+s3)*100)/300;

    // let's make it out of 10
    float cgpa = percentage/10;

    System.out.println(cgpa);

    }
}
