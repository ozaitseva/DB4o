/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimeproject;

import java.util.Comparator;

/**
 *
 * @author Ольга
 */
public class Criminal {
    private String name, sex, citizenship;
    private int age;
    //private boolean is_sane;
    
    public Criminal(String name, String sex, String citizenship, int age){
        this.name = name;
        this.sex = sex;
        this.citizenship = citizenship;
        this.age = age;
       // this.is_sane = is_sane;
    }
    Criminal(){}
    public String getName() {
        return name;
    }
    
     public String toString() {
        return (" name:" + name+";"+"\n"+"  sex: "+sex+";\n"+"  citizenship: "+citizenship+";\n"+"  age: "+age+"\n");
    }
     
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship (String citizenship) {
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public Boolean getIs_sane() {
        return is_sane;
    }

    public void setIs_sane(Boolean is_sane) {
        this.is_sane = is_sane;
    }*/
    
    public static Comparator<Criminal> GroupByName = new Comparator<Criminal>() {
        @Override
        public int compare(Criminal c1, Criminal c2) {
            String Name1 = c1.getName().toUpperCase();
            String Name2 = c2.getName().toUpperCase();
             //ascending order
            return Name1.compareTo(Name2);
        }
    };
     public static Comparator<Criminal> GroupByAge = new Comparator<Criminal>() {

	public int compare(Criminal s1, Criminal s2) {

	   if (s1.age > s2.age) {
                return 1;
            }
            if (s1.age < s2.age) {
                return -1;
            }
            return 0;
   }};
   
}
