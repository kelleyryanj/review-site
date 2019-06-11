package org.wecancodeit.review1;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

import java.util.Collection;

public class ReviewTest {

	ReviewRepository underTest;
	
	private long review1Id = 1L;
	
	private long review2Id = 2L;
	
	private Review review1 = new Review(review1Id, "movieName", "movieGenre", "", "review");
	private Review review2 = new Review(review2Id, "movieName", "movieGenre", "", "review");
	
	@Test

	public void shouldFindAReview() {
		underTest = new ReviewRepository(review1);
		Review result = underTest.findOne(review1Id);
		assertThat(result, is(review1));

	}
	@Test
	public void shouldFindTwoReviews() {
		underTest = new ReviewRepository(review2);
		Review result = underTest.findOne(review2Id);
		assertThat(result, is(review2));
	}
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(review1, review2);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(review1, review2));
	}

}
