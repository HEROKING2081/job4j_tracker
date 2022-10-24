package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Delete item ===");
        int id = input.askInt("Item id: ");
        if (tracker.delete(id)) {
            System.out.println("Item was deleted!");
        } else {
            System.out.println("ERROR. Item not found.");
        }
        System.out.println("=============================" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator());

        return true;
    }
}
