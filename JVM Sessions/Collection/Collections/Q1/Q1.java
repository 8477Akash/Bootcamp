package Collections.Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {
    public  static void ListOps() {
        List<Float> Fp =  new ArrayList<Float>();

        Fp.add((float)1.0);
        Fp.add((float)2.0);
        Fp.add((float)3.0);
        Fp.add((float)4.0);
        Fp.add((float)5.0);

        Iterator<Float> f = Fp.iterator();
        Float sum = 0.0f;
        while(f.hasNext()){
            sum += f.next();
        }
        System.out.println("Values in List are : ");
        for(Float v : Fp){
            System.out.println(v);
        }
        System.out.print("Sum : ");
        System.out.println(sum);
    }
}
