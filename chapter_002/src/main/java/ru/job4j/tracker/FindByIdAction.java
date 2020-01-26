package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "==== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item: " + item.getName() + ", id: " + item.getId());
        } else {
            System.out.println("Item with id : " + id + "could not be found");
        }
        return true;
    }
}
