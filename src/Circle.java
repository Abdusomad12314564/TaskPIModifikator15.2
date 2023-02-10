public class Circle {
    private final double PI=3.14;

    public Circle() {
    }

    public static void area (double ar){
        System.out.println("Area = "+Math.PI*(ar*ar));
    }
    public static void circumference(double radius){
        System.out.println("Circumference = "+Math.PI*2*radius);
    }
}
