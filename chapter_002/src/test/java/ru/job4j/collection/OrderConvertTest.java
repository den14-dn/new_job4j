package ru.job4j.collection;

import static org.hamcrest.core.Is.is;
import static  org.junit.Assert.assertThat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        var order = new Order("3sfe", "Table");
        orders.add(order);
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(order));
    }
}
