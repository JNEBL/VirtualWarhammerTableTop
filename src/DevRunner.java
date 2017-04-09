import BaseArea.Model;
import BaseArea.Vehicle;
import Factions.Dark_Eldar.Archon;
import Factions.Dark_Eldar.Ravager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by jnebl on 4/6/2017.
 */
public class DevRunner {
    public static void main(String args[]){
//        Model model = new Archon();
//        System.out.println(model);
        Vehicle vehicle = new Ravager();
        System.out.println(vehicle);

    }
}
