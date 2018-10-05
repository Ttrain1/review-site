package org.wecancodeit.reviewsite;



	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.stereotype.Repository;
	

	@Repository
	public class ReviewRepository {
		
		private Map<Long, Review> reviews = new HashMap<>();

		public ReviewRepository() {
			add(new Review(1L, "Moth Meme", "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjVu8m00e_dAhXr4IMKHa57De0QjRx6BAgBEAU&url=http%3A%2F%2Fwww.smosh.com%2Farticles%2Fmoth-memes&psig=AOvVaw08vym4jkuaYC3pdXPg3PkG&ust=1538840274962069", "missing moth imge", "Meme", "So Hot Right Now"));
			add(new Review(2L, "Tide pod Meme", "https://studybreaks.com/wp-content/uploads/2018/01/DTq2KRWVMAEd1wx-e1516823440510.jpg", "missing Tide pod Meme", "Meme", "Dead"));
			add(new Review(3L, "Nike Sacrifice Meme", "https://imgflip.com/memetemplate/149967681/Nike-Hitler", "missing meem", "Meme", "Satle"));
			
		}

		public int size() {
			return reviews.size();
		}

		public void add(Review review) {
			reviews.put(review.getId(), review);
		}

		public Review findOne(Long id) {
			return reviews.get(id);
		}

		public Collection<Review> findAll() {
			return reviews.values();
		}
		
		
	}

