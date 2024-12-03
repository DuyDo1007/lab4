package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int qtyInStore = 0;
	public void addMedia(Media media) {
	    if (!itemsInStore.contains(media)) {
	        itemsInStore.add(media);
	        System.out.println(media.getTitle() + " has been added to the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is already in the cart.");
	    }
	}

	public void removeMedia(Media media) {
	    if (itemsInStore.contains(media)) {
	        itemsInStore.remove(media);
	        System.out.println(media.getTitle() + " has been removed from the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is not in the cart.");
	    }
	}

    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore.toString());
        }
        System.out.println("***************************************************");
    }
    public void sortStoreByCostTitle() {
        Collections.sort(itemsInStore, new Comparator<Media>() {
            @Override
            public int compare(Media m1, Media m2) {
                int costCompare = Float.compare(m2.getCost(), m1.getCost());
                if (costCompare == 0) {
                    return m1.getTitle().compareToIgnoreCase(m2.getTitle());
                }
                return costCompare;
            }
        });
    }
}
