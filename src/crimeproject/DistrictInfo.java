/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimeproject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ольга
 */
public class DistrictInfo {
    String name;
    private List crimes;
    private List criminals;
    
    public DistrictInfo(String name, List crimes, List criminals){
        this.name = name;
        this.crimes = crimes;
        this.criminals = criminals;
    }
    
    public DistrictInfo(String name){
        this.name = name;
        crimes = new ArrayList();
        criminals = new ArrayList();                
    }
    
    public DistrictInfo(){}
    
    public String toString(){
        return ("District: " + name + ";\n");
    }
        
    public String getName(){
        return name;
    }
    
    public void setName(String name){
       this.name = name; 
    }
    
    public List getCrimes(){
        return crimes;
    }
    
    public void setCrimes(List crimes){
       this.crimes = crimes; 
    }
    
    public List getCriminals(){
        return criminals;
    }
    
    public void setCriminals(List criminals){
       this.criminals = criminals; 
    }
    
    public static Comparator<DistrictInfo> GroupByName = new Comparator<DistrictInfo>() {
        @Override
        public int compare(DistrictInfo d1, DistrictInfo d2) {
            String Name1 = d1.getName().toUpperCase();
	   String Name2 = d2.getName().toUpperCase();
             //ascending order
	   return Name1.compareTo(Name2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
            // this mean the first column is tied in thee two rows
        }
        /*public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }*/
    };
}
