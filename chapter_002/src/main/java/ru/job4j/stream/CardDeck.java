package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CardDeck {
    public List<Card> cards = new ArrayList<>();

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static class Card {
        private Suit suit;
        private Value value;

        @Override
        public String toString() {
            return "Card{"
                    + "suit=" + suit
                    + ", value=" + value
                    + '}';
        }

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Stream.of(Value.values())
                .forEach(elValue -> {
                    Stream.of(Suit.values())
                            .forEach(elSuit -> {
                                cardDeck.cards.add(new CardDeck.Card(elSuit, elValue));
                            });
                });
        System.out.println(cardDeck.cards);
    }
}
