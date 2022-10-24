package ru.job4j.tracker;

public class ShowAction implements UserAction {

    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== All items ===");
        Item[] out = tracker.findAll();
        for (Item item : out) {
            System.out.println(item);
        }
        System.out.println("All items showed." + System.lineSeparator() + "============================="
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator());

        return true;
    }
}
