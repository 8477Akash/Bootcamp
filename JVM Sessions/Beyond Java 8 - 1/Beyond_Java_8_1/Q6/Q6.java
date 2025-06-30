package Beyond_Java_8_1.Q6;

public class Q6 {
    enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
        REFUNDED
    }

    public static String processOrderStatus(OrderStatus s) {
        return switch (s) {
            case PENDING->"Order is awaiting confirmation.";
            case PROCESSING->"Order is being prepared.";
            case SHIPPED->"Order has been dispatched." ;
            case DELIVERED-> "Order has been successfully delivered.";
            case CANCELLED->"Order has been canceled.";
            case REFUNDED-> {
                String m = "Refund has been issued for the order.";
                yield m;
            }
            default->"Something Went Wrong";
        };
    }

    public static void main(String[] args) {

      OrderStatus s = OrderStatus.PENDING;
      String ans = processOrderStatus(s);

      System.out.println(ans);
    }
}
