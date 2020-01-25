package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("==== Show all items ====");
        Item[] items = tracker.findAll();
        for (Item el : items) {
            System.out.println("Item: " + el.getName() + ", id: " + el.getId());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("==== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find item by id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        System.out.println("Item: " + item.getName() + ", id: " + item.getId());
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        for (Item el : items) {
            System.out.println("Item: " + el.getName() + ", id: " + el.getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select:   ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6){
                System.out.println("==== Exit program ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
