package ru.job4j.tracker;

public class StubInput implements Input {
    @Override
    public String askstr(String question) {
        return null;
    }

    @Override
    public int askint(String question) {
        return 0;
    }
}
