package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {
	private int id;
	public String title;
	public String category;
	public float cost; 
	public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
	public Media () {
		public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
		    @Override
		    public int compare(Media m1, Media m2) {
		        int titleCompare = m1.getTitle().compareToIgnoreCase(m2.getTitle());
		        if (titleCompare == 0) {
		            return Float.compare(m2.getCost(), m1.getCost());
		        }
		        return titleCompare;
		    }
		};
		public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
		    @Override
		    public int compare(Media m1, Media m2) {
		        int costCompare = Float.compare(m2.getCost(), m1.getCost());
		        if (costCompare == 0) {
		            return m1.getTitle().compareToIgnoreCase(m2.getTitle());
		        }
		        return costCompare;
		    }
		};


}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Media media = (Media) obj;
	    return title.equalsIgnoreCase(media.title);
	}
	@Override
	public String toString() {
	    return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}
}
