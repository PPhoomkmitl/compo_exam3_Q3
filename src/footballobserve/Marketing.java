/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserve;

/**
 *
 * @author Phoom1645
 */
public class Marketing implements MyAudience {
    @Override
    public void update(Source o){
        System.out.println("Live Result 2 " + ((HeadQuater)o).getSomeData());
    }
    
}
