package com.company;

public class Student {
    private int classroom;
    private String name;
    private int number;
    private int age;
    private String sex;
    public Student(int classroom,String name,int number,int age,String sex){
        this.setClassroom(classroom);
        this.setName(name);
        this.setNumber(number);
        this.setAge(age);
        this.setSex(sex);
    }
    public int getClassroom(){
        return classroom;
    }
    public void setClassroom(int classroom){
        this.classroom=classroom;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String toString(){
        return"班级："+this.classroom+"姓名："+this.name+"学号"+this.number+"年龄："+this.age+"性别"+this.sex;
    }


}
