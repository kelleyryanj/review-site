package org.wecancodeit.review1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static java.util.Arrays.*;

import java.util.Collection;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)

public class ReviewControllerMockMvcTest {
	
	@Resource
	private MockMvc mvc;
	
	@Mock
	private Review review1;
	
	@Mock
	private Review review2;
	
	@MockBean
	private ReviewRepository reviewRepository;
		
	
	@Test
	public void shouldBeOkForAllReviews() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToAllReviews() throws Exception{
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}

	@Test
	public void shouldPutAllReviewsIntoModel() throws Exception{
		Collection<Review> allReviews = asList(review1, review2);
		when(reviewRepository.findAll()).thenReturn(allReviews);
		mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews", is(allReviews)));
	}
	
	@Test
	public void shouldBEOkForASingleReview() throws Exception{
		mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
	}
		
}
