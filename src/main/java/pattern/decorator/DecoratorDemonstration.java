package pattern.decorator;

import pattern.decorator.domain.DecoratedItem;

public class DecoratorDemonstration {

    public static void main (String[] args) {
        DecoratedItem book = new DecoratedItem();

        // old properties coming from Item class
        book.name = "Pattern Book";
        book.price = 20.90D;

        // new method extending Item
        book.updateQuality();

    }

}
