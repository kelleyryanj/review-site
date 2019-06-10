package org.wecancodeit.review1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review majorPayne = new Review(1L, "Major Payne", "Comedy",
				"https://i.ibb.co/P6jgBG1/major-payne.jpg",
				"A funny goofy movie ");
		Review endgame = new Review(2L, "Avengers: EndGame", "Action/SciFi",
				"https://i.ibb.co/xX6BjGt/endgame.jpg",
				"Very serious sometimes emotional ride");

		reviewList.put(majorPayne.getId(), majorPayne);
		reviewList.put(endgame.getId(), endgame);

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
