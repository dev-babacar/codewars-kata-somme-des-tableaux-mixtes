import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
    int numInt = 0;
    int numString = 0;
    for(Object num : mixed){
      if (num instanceof String){
        
        numString+= Integer.parseInt((String) num);
        
      }else if (num instanceof Integer){
        try {
           numInt += (Integer) num;
        } catch (NumberFormatException e){
          System.out.println("Valeur non numérique ignorée : " + num);
        }
      }   
    }
		return numInt + numString;
	}
}
