package Module_1.Q6;

public class BOI extends Bank {
    public BOI() {
        super("BOI", "Mumbai, Maharashtra", "Rajneesh Karnatak",
                5000, 5.7, 11.0, 7.3);
    }

    @Override
    public String toString() {
        return "Bank of India Details:\n" + super.toString();
    }
}
