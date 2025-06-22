package Module_1.Q6;

public class ICICI extends Bank {
    public ICICI() {
        super("ICICI", "Mumbai, Maharashtra", "Sandeep Bakhshi",
                5300, 6.0, 11.5, 8.2);
    }

    @Override
    public String toString() {
        return "ICICI Bank Details:\n" + super.toString();
    }
}
