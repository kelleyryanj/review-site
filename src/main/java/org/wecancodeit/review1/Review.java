package org.wecancodeit.review1;

public class Review {

	private long id;
	private String movieGenre;
	private String movieReview;
	private String imageUrl;
	private String title;

	public Review(long id, String title, String movieGenre, String imageUrl, String movieReview) {
		this.id = id;
		this.title = title;
		this.movieGenre = movieGenre;
		this.imageUrl = imageUrl;
		this.movieReview = movieReview;
	}
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getMovieGenre() {
		return movieGenre;
			}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getMovieReview() {
		return movieReview;
	}
}
