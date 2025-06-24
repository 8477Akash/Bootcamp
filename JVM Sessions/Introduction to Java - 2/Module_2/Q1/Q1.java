package Module_2.Q1;


public class Q1 {
    public static void ENUM() {
        House small = House.SMALL;
        House medium = House.MEDIUM;
        House large = House.LARGE;

        System.out.println("House Type :"+ small.name() +"  "+ small.getPrice());
        System.out.println("House Type :"+ medium.name() +"  "+medium.getPrice());
        System.out.println("House Type :"+ large.name() +"  "+large.getPrice());
    }
}