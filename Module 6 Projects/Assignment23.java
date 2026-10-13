package a23;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Assignment23 {
	
	public static void main(String[] args) {
			
		Stream<String> s = Stream.of("red", "blue", "green", "yellow", "orange", "purple", "aqua", "pink", "rose", "brown");
		//s.filter(color -> !color.startsWith("r"));
		//s.filter(color -> color.length() >= 5);
		//List<String> colors = s.collect(Collectors.toList());
        
        List<String> colors = s
        		.filter(color -> !color.startsWith("r"))
        		.filter(color -> color.length() >= 5)
        		.collect(Collectors.toList());
		
        int listSize = colors.size();
        System.out.println("List size: " + listSize);
        System.out.println("Colors listed: " + colors);
	}
}
