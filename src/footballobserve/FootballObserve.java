/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballobserve;
import java.util.*;

/**
 *
 * @author Phoom1645
 */
public class FootballObserve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HeadQuater obj = new HeadQuater();
        Senior obj1 = new Senior();
        Marketing obj2 = new Marketing();
        Scanner sc = new Scanner(System.in);
        System.out.print("Socre 1 >> ");
        String data1 = sc.nextLine();
        obj.Register(obj1);
        obj.Register(obj2);
        obj.setSomeData(data1);
        System.out.print("Socre 2 >> ");
        String data2 = sc.nextLine();
        obj.setSomeData(data2);
        
    }
}
