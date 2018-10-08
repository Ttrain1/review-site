package org.wecancodeit.reviewsite;

public class Review {

	long id;
	private String title;
	private String image;
	private String imageUrl;
	private String imageNotShow;
	private String category;
	private String rateing;
	
	public Review(Long id, String title, String image, String imageUrl, String imageNotShow, String category, String rateing) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.imageUrl = imageUrl;
		this.imageNotShow = imageNotShow;
		this.category = category;
		this.rateing = rateing;
	}
	public String getImage() {
		return image;
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
