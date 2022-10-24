package ru.job4j.tracker;

public class ShowByIdAction implements UserAction {

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(System.lineSeparator() + "=== Find item by Id ===");
        int id = input.askInt("Enter item id: ");
        Item rsl = tracker.findById(id);
        if (rsl != null) {
            System.out.println("Result = " + rsl.toString());
        } else {
            System.out.println("Item not found.");
        }
        System.out.println("=============================" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator());

        return true;
    }
}
