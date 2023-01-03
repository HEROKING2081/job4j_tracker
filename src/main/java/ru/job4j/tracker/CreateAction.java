package ru.job4j.tracker;

public class CreateAction implements UserAction {

    private final Output out;

    public CreateAction(final Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(final Input input, final MemTracker tracker) {
        out.println(System.lineSeparator() + "=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        out.println("Item successful created."
                + System.lineSeparator()
                + "============================="
                + System.lineSeparator()
                + System.lineSeparator()
                + System.lineSeparator());

        return true;
    }
}
