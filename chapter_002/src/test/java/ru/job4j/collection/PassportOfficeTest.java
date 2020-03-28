package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PassportOfficeTest {
    @Test
    public void add() {
        Citizen citizen = new Citizen("6403 123456", "Shubko Denis");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}
