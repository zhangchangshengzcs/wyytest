import java.io.Serializable;

public class Emp implements Serializable{
    private Integer age;
    private String name;
    private Double sal;
    private Double comm;
    public static void main(String[] args){
        Emp emp=new Emp();
        emp.age+=1;
        System.out.println("this is master");
        System.out.println("this is zcs");
        emp.age-=1;
        System.out.println("this is brh");
        System.out.println("这是修改");
        System.out.println("这是brh的修改");
        System.out.println("brh未完成修改");
        System.out.println("这是cbrh的修改");
    }
    public String toString(){
        return "一位雇员";
    }

}