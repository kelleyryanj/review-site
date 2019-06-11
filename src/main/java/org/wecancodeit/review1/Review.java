package org.wecancodeit.review1;

public class Review {

	private long id;
	private String reviewCategory;
	private String reviewContent;
	private String imageUrl;
	private String title;

	public Review(long id, String title, String reviewCategory, String imageUrl, String reviewContent) {
		this.id = id;
		this.title = title;
		this.reviewCategory = reviewCategory;
		this.imageUrl = imageUrl;
		this.reviewContent = reviewContent;
	}
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
			}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getReviewContent() {
		return reviewContent;
	}
}
