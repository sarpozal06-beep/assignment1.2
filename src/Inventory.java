package game.inventory;

/** Manages a collection of items in the game shop. */
public class Inventory {
    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("Inventory is full; cannot add " + item.getName() + ".");
            return;
        }
        items[count] = item;
        count++;
    }

    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    item.getName(), item.getGenre(), item.getStockCount());
        }
    }

    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.printf("%-15s -> %s%n", item.getName(), item.getSerialCode());
        }
    }
}

