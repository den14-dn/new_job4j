package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "==== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean isDeleted = tracker.delete(id);
        if (isDeleted) {
            System.out.println("Item successfully deleted");
        } else {
            System.out.println("Don't delete item");
        }
        return true;
    }
}
