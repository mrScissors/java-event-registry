package event_registry.event;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class events_list {
	List<events> events_list = new ArrayList<events>();
	public List<events> populate_events_list(){
		events m1 = new events(0, "Kalsubai", "Trek", 50, 100);
		events_list.add(m1);
		
		
		events m2 = new events(1, "Shimla-kulu", "Trip", 38, 100);
		events_list.add(m2);
		
		
		events m3 = new events(2, "Ganges", "Rappling", 60, 100);
		events_list.add(m3);
		
		
		events m4 = new events(3, "Nandi hills", "Outing", 65, 100);
		events_list.add(m4);
		
		
		events m5 = new events(4, "Raigad", "Historical", 43, 100);
		events_list.add(m5);
		
				
		return events_list;
	
	}
	
	public List<events> filter_event_list(String a){
		List<events> filter_list = new ArrayList<events>();
		//System.out.println("Movie List ::::::"+this.movie_list);
//		this.movie_list.forEach(n -> System.out.println(n));
		
		filter_list = this.events_list.stream()
				.filter(event -> a.equals(((event_registry.event.events) event).getType()))
				.collect(Collectors.toList());
		return filter_list;
	}
	

}
