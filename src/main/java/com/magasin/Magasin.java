package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            if (items[i].name.equals("Kryptonite")) {
                items[i].quality = 80;
                items[i].sellIn = 9001;
            }
            else if (items[i].name.equals("Comté")) {
                items[i].quality += 1;
                items[i].sellIn -= 1;
                if (items[i].sellIn < 0) {
                    items[i].quality += 1;
                }
                if (items[i].quality > 50) {
                    items[i].quality = 50;
                }
            }
            else if (items[i].name.equals("Pass VIP Concert")) {

                if (items[i].quality > 50) {
                    items[i].quality = 50;
                }
                else if (items[i].sellIn < 0) {
                    items[i].quality = 0;
                }
                else if (items[i].sellIn < 6) {
                    items[i].quality += 3;
                }
                else if (items[i].sellIn < 11) {
                    items[i].quality += 2;
                }
                else {
                    items[i].quality += 1;
                    items[i].sellIn -= 1;
                }
            }
            else if (items[i].name.equals("Pouvoirs magiques")) {
                items[i].quality -= 2;
                items[i].sellIn -= 1;
                if (items[i].sellIn < 0) {
                    items[i].quality -= 2;
                }
                if (items[i].quality > 50) {
                    items[i].quality = 50;
                }
            }
            else {
                items[i].quality -= 1;
                items[i].sellIn -= 1;
                if (items[i].sellIn < 0) {
                    items[i].quality -= 1;
                }
                if (items[i].quality > 50) {
                    items[i].quality = 50;
                }
            }
        }
    }
}
/*public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Comté")
                    && !items[i].name.equals("Pass VIP Concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Kryptonite")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Kryptonite")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Comté")) {
                    if (!items[i].name.equals("Pass VIP Concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Kryptonite")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }*/