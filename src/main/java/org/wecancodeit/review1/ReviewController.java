package org.wecancodeit.review1;

import javax.annotation.Resource;

import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;
		
	@RequestMapping("/show-reviews")
	public String findAllCourses(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
			return "reviews";
	}
	
	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findOne(id));
		return "review";
	}
	
}
