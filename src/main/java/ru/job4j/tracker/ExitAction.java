package ru.job4j.tracker;

public class ExitAction implements UserAction {

    private Output out;

    public ExitAction() {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, MemTracker tracker) {
        return false;
    }

    public Output getOut() {
        return out;
    }
}
