package org.wecancodeit.reviewsite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ReviewsController {

	@Resource
	private ReviewRepository reviewRepo;

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
	
	@GetMapping ("/reviews/{id}")
	public String getReviews(@PathVariable(value ="id") Long id, Model model) {
	System.out.println(reviewRepo.findOne(id) );
	model.addAttribute("review", reviewRepo.findOne(id));
	return "review";
	}
}
