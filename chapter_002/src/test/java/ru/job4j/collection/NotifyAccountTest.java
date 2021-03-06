package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Denis Shubko", "eDer3432f"),
                new Account("142", "Denis Shubko", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Denis Shubko", "eDer3432f"),
                        new Account("142", "Denis Shubko", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
