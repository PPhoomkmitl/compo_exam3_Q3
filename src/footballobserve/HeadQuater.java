/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballobserve;
import java.util.*;

/**
 *
 * @author Phoom1645
 */
public class HeadQuater implements Source {
    private final ArrayList<MyAudience> list;
    private String someData;
    
    public HeadQuater(){
        this.list = new ArrayList<>() ;
    }
    
    public void setSomeData(String data){
        this.someData = data;
        notifyAudience();
    }
    public String getSomeData(){
        return this.someData;
    }
    
    @Override
    public void Register(MyAudience obj){
        this.list.add(obj);
    }
    
    @Override
    public void notifyAudience(){
        for(MyAudience Audi : this.list){
           Audi.update(this);
        }
    }
}
