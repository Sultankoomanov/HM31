package kg.attractor.java;

// import static java.util.stream.Collectors.*;
// import static java.util.Comparator.*;

// используя статические imports
// мы импортируем *всё* из Collectors и Comparator.
// теперь нам доступны такие операции как
// toList(), toSet() и прочие, без указания уточняющего слова Collectors. или Comparator.
// вот так было до импорта Collectors.toList(), теперь стало просто toList()


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 32,321,31);
//        var squared = numbers.stream()
//                .map(e -> e * e)
//                .collect(toList());
//        squared.forEach(System.out::println);




        // это для домашки
        // выберите любое количество заказов, какое вам нравится.

        //var orders = RestaurantOrders.read("orders_100.json").getOrders();
        //var orders = RestaurantOrders.read("orders_1000.json").getOrders();
        //var orders = RestaurantOrders.read("orders_10_000.json").getOrders();

        // протестировать ваши методы вы можете как раз в этом файле (или в любом другом, в котором вам будет удобно)
    }
}
