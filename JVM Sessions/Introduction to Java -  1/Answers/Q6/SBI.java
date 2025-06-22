package Module_1.Q6;

public class SBI extends Bank{
    public SBI() {
        super("SBI", "Mumbai, Maharashtra", "Dinesh Kumar Khara",
                22000, 5.5, 10.5, 7.0);
    }

    @Override
    public String toString() {
        return "SBI Bank Details:\n" + super.toString();
    }
}