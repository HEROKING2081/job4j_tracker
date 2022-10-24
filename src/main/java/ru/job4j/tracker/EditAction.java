package ru.job4j.tracker;

public class EditAction implements UserAction {

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Edit item ===");
        int id = input.askInt("Item id: ");
        String newName = input.askStr("New item name: ");
        Item item = new Item(id, newName);
        if (tracker.replace(id, item)) {
            System.out.println("Item was successful edited.");
        } else {
            System.out.println("ERROR. Item not found.");
        }
        System.out.println("=============================" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator());

        return true;
    }
}
