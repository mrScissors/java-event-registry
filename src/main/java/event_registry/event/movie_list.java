package event_registry.event;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class movie_list {
	
	List<movie> movie_list = new ArrayList<movie>();
	public List<movie> populate_movie_list(){
		
		movie m1 = new movie(0, "Die Hard", "Action", 50, 100);
		movie_list.add(m1);
		
		movie m2 = new movie(1, "Terminator2", "Action", 38, 100);
		movie_list.add(m2);
		
		movie m3 = new movie(2, "13 Hours", "Action", 60, 100);
		movie_list.add(m3);
		
		
		movie m4 = new movie(3, "Johnny English", "Comedy", 65, 100);
		movie_list.add(m4);
		
		
		movie m5 = new movie(4, "Little Miss Sunshine", "Feel-good", 43, 100);
		movie_list.add(m5);
		
		
		movie m6 = new movie(5, "Back to the future", "Scifi", 12, 100);
		movie_list.add(m6);
		
		
		movie m7 = new movie(6, "Avengers Infinity War", "Superhero", 50, 100);
		movie_list.add(m7);
		
		
		movie m8 = new movie(7, "Deadpool", "Superhero", 1, 100);
		movie_list.add(m8);
		
		
		movie m9 = new movie(8, "Man from Earth", "Scifi", 8, 100);
		movie_list.add(m9);
		
		
		movie m10 = new movie(9, "Babadook", "Horror", 65, 100);
		movie_list.add(m10);
		

		
		return movie_list;
	
	}
	
	
	public List<movie> filter_movie_list(String a){
		List<movie> filter_list = new ArrayList<movie>();
		//System.out.println("Movie List ::::::"+this.movie_list);
//		this.movie_list.forEach(n -> System.out.println(n));
		
		filter_list = this.movie_list.stream()
				.filter(movie -> a.equals(((event_registry.event.movie) movie).getGenre()))
				.collect(Collectors.toList());
		return filter_list;
	}


	public movie get(int number) {
		movie movie_g = (movie) this.movie_list.stream()
				.filter(movie -> ((event_registry.event.movie) movie).getId() == number);
		return movie_g;
	}
	
	
}
