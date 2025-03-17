package ListEx;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(10);
        System.out.println(a.get(4));

        if(a.contains(100)){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}
