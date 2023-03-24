package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    String[] resultExpected = new String[]{
            "Comté, -1, 17",
            "Comté, 0, 16",
            "Comté, -1, 50",
            "Comté, 0, 50",
            "Comté, 199, 50",
            "Comté, 199, 80",
            "Kryptonite, 10, 50",
            "Kryptonite, 10, 80",
            "Kryptonite, 0, 80",
            "Kryptonite, -1, 80",
            "Pass VIP Concert, 11, 11",
            "Pass VIP Concert, 9, 12",
            "Pass VIP Concert, 4, 13",
            "Pass VIP Concert, 1, 13",
            "Pass VIP Concert, 0, 13",
            "Pass VIP Concert, -1, 0",
            "mon item, 14, 9",
            "mon item, 9, 9",
            "mon item, 4, 9",
            "mon item, -1, 8"
    };

    @Test
    void foo() {
        Item[] items = new Item[] {
                new Item("Comté", 0, 15),
                new Item("Comté", 1, 15),
                new Item("Comté", 0, 50),
                new Item("Comté", 1, 50),
                new Item("Comté", 200, 50),
                new Item("Comté", 200, 80),
                new Item("Kryptonite", 10, 50),
                new Item("Kryptonite", 10, 80),
                new Item("Kryptonite", 0, 80),
                new Item("Kryptonite", -1, 80),
                new Item("Pass VIP Concert", 12, 10),
                new Item("Pass VIP Concert", 10, 10),
                new Item("Pass VIP Concert", 5, 10),
                new Item("Pass VIP Concert", 2, 10),
                new Item("Pass VIP Concert", 1, 10),
                new Item("Pass VIP Concert", 0, 0),
                new Item("mon item", 15, 10),
                new Item("mon item", 10, 10),
                new Item("mon item", 5, 10),
                new Item("mon item", 5, 10),

        };
        Magasin app = new Magasin(items);
        app.updateQuality();
        for (int i = 0; i < items.length; i++) {
            System.out.println(resultExpected[i] + " <---- resultat attendu");
            System.out.println(app.items[i]);
        }
        assertEquals("Comté", app.items[0].name);
    }

}
