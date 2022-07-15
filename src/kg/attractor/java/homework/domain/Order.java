package kg.attractor.java.homework.domain;



import java.util.List;
import java.util.Objects;

public class Order {
    // Этот блок кода менять нельзя! НАЧАЛО!
    private final Customer customer;
    private final List<Item> items;
    private final boolean homeDelivery;
    private transient double total = 0.0d;

    public Order(Customer customer, List<Item> orderedItems, boolean homeDelivery) {
        this.customer = customer;
        this.items = List.copyOf(orderedItems);
        this.homeDelivery = homeDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return homeDelivery == order.homeDelivery &&
                Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, homeDelivery);
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isHomeDelivery() {
        return homeDelivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }
    // Этот блок кода менять нельзя! КОНЕЦ!

    //----------------------------------------------------------------------
    //------   Реализация ваших методов должна быть ниже этой линии   ------
    //----------------------------------------------------------------------


    public double calculateTotal() {
      return items.stream()
                .mapToDouble(Item::getTotalPriceAmount)
                .sum();
//        throw new NotImplementedException("Вам надо реализовать этот метод!");
    }

    public void printAllItems() {
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("------------------------------------------------------");
        System.out.print("Name |  Type |  Price Amount |   Total price\n");
        items.stream().map(Item::toString).forEach(System.out::println);
        System.out.println("Total: " + String.format("%.2f",calculateTotal()));
        System.out.println();
    }
}
