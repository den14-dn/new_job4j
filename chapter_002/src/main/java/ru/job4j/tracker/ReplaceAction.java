package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "==== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        boolean isReplaced = tracker.replace(id, item);
        if (isReplaced) {
            System.out.println("Item successfully replaced");
        } else {
            System.out.println("Don't replace item");
        }
        return true;
    }
}
