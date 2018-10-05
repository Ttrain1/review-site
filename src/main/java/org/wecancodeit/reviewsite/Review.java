package org.wecancodeit.reviewsite;

public class Review {

	long id;
	String title;
	String imageUrl;
	String imageNotShow;
	String category;
	String rateing;
	public Review(long id, String title, String imageUrl, String imageNotShow, String category, String rateing) {
		super();
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.imageNotShow = imageNotShow;
		this.category = category;
		this.rateing = rateing;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getImageNotShow() {
		return imageNotShow;
	}
	public String getCategory() {
		return category;
	}
	public String getRateing() {
		return rateing;
	}
	
}
