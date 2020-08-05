package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class DataBase {
    List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(el -> el.getAddress()).collect(Collectors.toList());
    }

}
