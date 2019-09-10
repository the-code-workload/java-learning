public class Application {

    public static void main(String[] args) {
        System.out.println(UtilClass.sum(2,5));

        System.out.println(OrderType.BUY);

        String orderType = "Buy";
        System.out.println("BUY".equalsIgnoreCase(orderType));
    }
}
