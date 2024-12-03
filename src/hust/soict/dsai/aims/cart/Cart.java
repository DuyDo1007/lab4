package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;
public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media media) {
	    if (!itemsOrdered.contains(media)) {
	        itemsOrdered.add(media);
	        System.out.println(media.getTitle() + " has been added to the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is already in the cart.");
	    }
	}

	public void removeMedia(Media media) {
	    if (itemsOrdered.contains(media)) {
	        itemsOrdered.remove(media);
	        System.out.println(media.getTitle() + " has been removed from the cart.");
	    } else {
	        System.out.println(media.getTitle() + " is not in the cart.");
	    }
	}

	public float totalCost() {
	    float total = 0;
	    for (Media media : itemsOrdered) {
	        total += media.getCost();
	    }
	    return total;
	}
public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + items[i].toString());
    }
    System.out.println("Total cost: " + totalCost() + "$");
    System.out.println("***************************************************");
}
public void searchByTitle(String title) {
    boolean found = false;
    System.out.println("Searching for DVDs with title: " + title);
    for (int i = 0; i < qtyOrdered; i++) {
        if (items[i].isMatch(title)) {
            System.out.println((i + 1) + ". " + items[i].toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No DVDs found with the title \"" + title + "\".");
    }
}
}

