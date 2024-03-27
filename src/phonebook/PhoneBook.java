package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Entry> entries;

    public PhoneBook() {
        this.entries = new ArrayList<>();
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    public Entry find(String name) {
        for (Entry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                return entry;
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        List<Entry> foundEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                foundEntries.add(entry);
            }
        }
        return foundEntries.isEmpty() ? null : foundEntries;
    }
}
