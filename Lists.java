
import java.util.*;
/**
 *
 * @author MARLIAN
 */
public class Lists {
    public static void main(String[] args)
    {
    List<Integer> list = new ArrayList<>();
    list.add(Integer.valueOf(10));
    
    list.add(20);
    list.add(30);
    
    System.out.println("Reading from the lists");
    
    for(Integer i:list)
    {
    System.out.println(i);
    }
    }
}
