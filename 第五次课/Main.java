
package com.company;



import java.io.IOException;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.HashMap;

import java.util.ListIterator;

import java.util.Set;



import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;





import com.company.Students;

import com.company.datautils;





public class Main {



    static String url = "http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=13901802";

    static int i = 0;

    public static void body1() throws IOException{



        Document doc = Jsoup.connect(url).get();



        Element element =  doc.select("div#newlist_list_content_table").first();



        Elements tables = element.select("table");

        HashMap<Integer, Students>hMap = new HashMap<Integer, Students>();

        ListIterator<Element> listIter = tables.listIterator(1 );

        while(listIter.hasNext()){




            Element table = listIter.next();



            Element link = table.select("tr>td.zwmc").select("a").first();

            Element link1 = table.select("tr>td.gsmc").select("a").first();

            Element link2 = table.select("tr>td.zwyx").first();

            Element link3 = table.select("tr>td.gzdd").first();

            Element link4 = table.select("tr>td.gxsj").select("span").first();

            Element link5 = table.select("tr>td.gxsj").select("span").first();

            Students students = new Students();

            String url1=link.attr("href").toString();

            Document doc1 = Jsoup.connect(url1).get();

            Element element1 =  doc1.select("ul#terminal-ul clearfix").first();




            link.text();

            i++;



            students.setXh(link.text().toString());

            students.setXm(link1.text().toString());

            students.setXmEn(link2.text().toString());

            students.setXb(link3.text().toString());

            students.setBj(link4.text().toString());

            hMap.put(i, students);

        }



        Set<Integer> keys = hMap.keySet();



        for(Integer key:keys){

            Students value = hMap.get(key);

            Connection conn = null;

            try {

                PreparedStatement ps = null;

                conn = datautils.getConnection();

                String sql = "insert into students(xh,xm,xmEn,xb,bj)values(?,?,?,?,?)";

                ps = conn.prepareStatement(sql);

                ps.setString(1, value.getXh());

                ps.setString(2, value.getXm());

                ps.setString(3, value.getXmEn());

                ps.setString(4, value.getXb());

                ps.setString(5, value.getBj());

                ps.executeUpdate();

                conn.close();

            } catch (SQLException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

                System.out.println("数据库访问失败");

            }

            System.out.println(key+","+value.toString());

        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        body1();

    }

}
