package ru.job4j.tracker;

public class ShowToNameAction implements UserAction {

    private final Output out;

    public ShowToNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] rsl = tracker.findByName(name);
        if (rsl.length != 0) {
            System.out.println("Result: ");
            for (Item item : rsl) {
                System.out.println(item);
            }
        } else {
            System.out.println("Item(s) not found.");
        }
        System.out.println("=============================" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator());

        return true;
    }
}
