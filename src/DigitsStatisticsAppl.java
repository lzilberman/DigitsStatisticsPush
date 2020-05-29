import java.util.*;
import java.util.stream.Collectors;

public class DigitsStatisticsAppl {

	public static void main(String[] args) {
		displayDigitsStatistics();
	}
// unnecessary comment changed
	private static void displayDigitsStatistics() {
		new Random()
		.ints(1000000, 1, Integer.MAX_VALUE)
		.boxed().map(x->x.toString())  
		.flatMapToInt(x->x.chars()).map(x->x-'0').boxed()
		.collect(Collectors.groupingBy(x->x, Collectors.counting()))
		.entrySet().stream()
		.sorted( (x,y)->Long.compare(y.getValue() , x.getValue()) )
		.forEach(x->System.out.printf("%d->%d\n", x.getKey(), x.getValue() ));		
	}
		
}
