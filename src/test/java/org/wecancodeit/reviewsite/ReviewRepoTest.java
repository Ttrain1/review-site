package org.wecancodeit.reviewsite;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;


import org.junit.Test;


	public class ReviewRepoTest {

	
	private ReviewRepository ReviewRepo = new ReviewRepository();
	
	@Test
	public void shouldAddReview() {
		//Arrange
		Review max = new Review(5L, "q", "q", "q", "q", "q", "q");
		//Act
		int repoSizeBeforeAdding = ReviewRepo.size();
		ReviewRepo.add(max);
		int repoSizeAfterAdding = ReviewRepo.size();
		//Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
	}
	
	@Test
	public void findOneShouldReturnOneStudent() {
		Review usArmy = new Review(1L, "p", "p", "p", "P", "P", "P");
		
		ReviewRepo.add(usArmy);
		Review result = ReviewRepo.findOne(1L);
		
		assertThat(result.getTitle(), is("p"));
	}
	
	@Test
	public void findAllShouldReturnAllStudents() {
		Review we = new Review(6L, "w", "w", "w", "W", "w", "w");
		Review w = new Review(7L, "w", "w", "w","w" , "w", "w");
		
		ReviewRepo.add(we);
		ReviewRepo.add(w);
		
		Collection<Review> result = ReviewRepo.findAll();
		
		assertThat(result, hasItems(we, w));
	}
}

