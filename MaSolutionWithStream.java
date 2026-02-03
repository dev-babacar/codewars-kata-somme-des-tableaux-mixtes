import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
		return mixed.stream()
                .mapToInt(obj -> Integer.parseInt(obj.toString()))
                .sum();
	}
}
