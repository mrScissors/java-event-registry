package event_registry.event;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class print_stuff {
	public void printMovie(List<movie> list) {
		list.forEach(n -> System.out.println(n + "\n")); 
	}
	
	public void printEvent(List<events> list) {
		list.forEach(n -> System.out.println(n + "\n")); 
	}
	
//	public void print(Stream<Object> list) {
//		list.forEach(n -> System.out.println(n.toString() + "\n")); 
//	}
}

