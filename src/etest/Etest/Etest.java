package etest.Etest;

/**
 * Created by zhangxingchen on 2017/6/12.
 */

public class Etest {

    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge( int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setIdNum( String newId){
        idNum = newId;
    }
    public  static  void  main(String[] args){
        Etest E1 = new Etest();
        E1.setName("zhangxingchen");
        E1.setAge(28);
        E1.setIdNum("131002198902272222");
        System.out.println("姓名："+E1.getName()+","+"年龄："+E1.getAge()+","+"证件号："+E1.getIdNum()+"。");
    }
}