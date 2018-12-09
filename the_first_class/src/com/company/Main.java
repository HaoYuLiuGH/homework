package com.company;

import java.util.*;

public class Main {


	private static List<Student>students=new ArrayList<Student>();
	public static void init(){
	    students.add(new Student(01,"柳小橙",2018001,18,"男"));
            students.add(new Student(02,"柳小菊",2018002,18,"男"));
            students.add(new Student(03,"柳小果",2018003,18,"男"));
            students.add(new Student(04,"柳小花",2018004,18,"女"));
            students.add(new Student(05,"柳小龙",2018005,18,"男"));
        }
	@SuppressWarnings("unchecked")
            public static void sort(){
	    Collections.sort(students,new Comparator(){
	        @Override
            public int compare(Object s1,Object s2){
	            int one=((Student)s1).getNumber();
	            int two=((Student)s2).getNumber();
	            return one-two;
            }
        });
        }

    public static void main(String[] args) {
	    init();

    System.out.println("插入：柳小远");
    students.add(5,new Student(06,"柳小远",2018006,19,"男"));
    for(Student i:students)
    {
        System.out.println(i);
    }
   /* System.out.println("删除：柳小花");
        for(Student i:students)
        {
            if(i.getName().equals("柳小花"))
                students.remove(i);
            break;
        }
        for(Student i:students)
        {
            System.out.println(i);
        }*/ //学长，删除这里好像有问题 删不掉
        sort();
        System.out.println("学号升序");//只会升序不会降序，555555555
        for(Student s:students){
            System.out.println("班级："+s.getClassroom()+"姓名："+s.getName()+"学号："+s.getNumber()+"年龄："+s.getAge()+"性别："+s.getSex());
        }
}}
