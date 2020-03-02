package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Denis", "Shubko", "9258752900", "Lubertcy"));
        ArrayList<Person> persons = phones.find("Denis");
        assertThat(persons.get(0).getSurname(), is("Shubko"));
    }
}
