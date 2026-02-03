import java.util.List;

public class MixedSum {

    public int sum(List<?> mixed) {	
        int totalSum = 0;

        for (Object obj : mixed) {
            try {
                if (obj instanceof String) {
                    totalSum += Integer.parseInt((String) obj);
                } else if (obj instanceof Integer) {
                    totalSum += (Integer) obj;
                }
            } catch (NumberFormatException e) {
                // Utile si une String n'est pas un nombre valide (ex: "abc")
                System.err.println("Valeur non convertible : " + obj);
            }
        }
        return totalSum;
    }
}
