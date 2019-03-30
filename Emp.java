import java.io.Serializable;

public class Emp implements Serializable{
    private Integer age;
    private String name;
    private Double sal;
    private Double comm;
    public static void main(String[] args){
        Emp emp=new Emp();
        System.out.println("this is master");
    }

}