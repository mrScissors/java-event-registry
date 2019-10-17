package event_registry.event;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scn = new Scanner(System.in);
        movie_list movielistapp = new movie_list();
        events_list eventslistapp = new events_list();
        booking book = new booking();
        print_stuff printstuffapp = new print_stuff();
        
        System.out.println("Please select from the following by entering the number corresponding to the item:" + "\n"
        		+ "1. Movies" + "\n"
        		+ "2. Travel" + "\n");
        int i = scn.nextInt();
        int number=0;
        if(i == 1) {
        	printstuffapp.printMovie(movielistapp.populate_movie_list());
        	
        	System.out.println("To book movie, enter id of movie to book"
        			+ "\n"
        			+ "\n"
        			+ "To list movie by genres, enter the genre");
        	String input = scn.next();
        	if (input.length() == 1) {
        		System.out.println("Please enter your name");
        		String name = scn.next();
        		System.out.println("Please enter the number of seats");
        		try{number = scn.nextInt();
        		book.book_event(name, number, input);}
        		catch(Exception e){System.out.println("Please enter integer seat number");}
        		
        	}
        	else {
        		printstuffapp.printMovie(movielistapp.filter_movie_list(input));
        		System.out.println("To book movie, enter id of movie to book");
        		input = scn.next();
        		System.out.println("Please enter your name");
        		String name = scn.next();
        		System.out.println("Please enter the number of seats");
        		try{number = scn.nextInt();
        		book.book_event(name, number, input);}
        		catch(Exception e){System.out.println("Please enter integer seat number");}
        		
        	}
        	
        	
        }
        
        if (i == 2) {
        	printstuffapp.printEvent(eventslistapp.populate_events_list());
        	
        	System.out.println("To book event, enter id of event to book"
        			+ "\n"
        			+ "\n"
        			+ "To list event by types, enter the type");
        	String input = scn.next();
        	if (input.length() == 1) {
        		System.out.println("Please enter your name");
        		String name = scn.next();
        		System.out.println("Please enter the number of seats");
        		try{number = scn.nextInt();
        		book.book_event(name, number, input);}
        		catch(Exception e){System.out.println("Please enter integer seat number");}
        		
        	}
        	else {
        		printstuffapp.printEvent(eventslistapp.filter_event_list(input));
        		System.out.println("To book event, enter id of event to book");
        		input = scn.next();
        		System.out.println("Please enter your name");
        		String name = scn.next();
        		System.out.println("Please enter the number of seats");
        		try{number = scn.nextInt();
        		book.book_event(name, number, input);}
        		catch(Exception e){System.out.println("Please enter integer seat number");}
        		
        	}
        }
        
        
        
        
        scn.close();
        
    }
}
