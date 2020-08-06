package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DataBaseTest {
    @Test
    public void whenFiveAddresses() {
        DataBase dataBase = new DataBase();

        Address add1 = new Address("Люберцы", "Барыкина", 6, 166);
        Address add2 = new Address("Люберцы", "Дружбы", 1, 380);
        Address add3 = new Address("Вольск", "Плеханова", 10, 38);

        Profile pr1 = new Profile(add1);
        Profile pr2 = new Profile(add2);
        Profile pr3 = new Profile(add3);

        List<Profile> profiles = List.of(pr1, pr2, pr3);

        List<Address> rst = dataBase.collect(profiles);
        List<Address> exp = List.of(add3, add1, add2);
        assertThat(rst, is(exp));
    }
}
