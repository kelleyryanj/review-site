package org.wecancodeit.review1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review majorPayne = new Review(1L, "Major Payne", "Comedy", "/images/major-payne.jpg",
				"A funny goofy movie and lots of fun if you take it for what it is 3/5 stars, ");
		Review endgame = new Review(2L, "Avengers: EndGame", "Action/SciFi", "/images/endgame.jpg",
				"THe longest Marvel movie, takes itself too serious at times ut still a good ride 4/5 stars");
		Review starTrek1 = new Review(3L, "Star Trek The Motion Picture", "Sci FI", "/images/startrek.jpg",
				"The storyline is odd and they seemed to have blown their effects budget on the Enterprise so you are left with lots of flashing lights later on 2/5 stars");

		reviewList.put(majorPayne.getId(), majorPayne);
		reviewList.put(endgame.getId(), endgame);
		reviewList.put(starTrek1.getId(), starTrek1);

	}

	// for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {

		return reviewList.get(id);
	}

	public Collection<Review> findAll() {

		return reviewList.values();
	}

}
