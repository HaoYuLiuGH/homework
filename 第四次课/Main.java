package com.company;

import javax.management.openmbean.CompositeData;
import java.sql.*;

public class Main {
Connection con;
Statement statement;
ResultSet rs;
public Connection getCon(){
    return con;
}
public Statement getStatement(){
    return statement;
}
public ResultSet getRs(){
    return rs;
}
public Main(Connection con){
    this.con=con;
    try{
        statement=con.createStatement();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
public void insert()throws SQLException{
    String sql1="insert into test values (1,'tom')";
    String sql2="insert into test values (2,'张三')";
    String sql3="insert into test values (3,'999')";
    statement.addBatch(sql1);
    statement.addBatch(sql2);
    statement.addBatch(sql3);
    int[]results =statement.executeBatch();
}
public void select()throws SQLException{
    String sql="select id,name from test";
    rs=statement.executeQuery(sql);
    while(rs.next()){
        String id=rs.getString("id");
        String name=rs.getString("name");
        System.out.println(id+"\t"+name);
    }
}
public void update()throws SQLException{

}


    public static void main(String[] args) {
    Connection con=JDBCUtil.getConnection();
    Main main=new Main(con);
    try{
        main.insert();
        main.select();

    }catch (SQLException e){
        e.printStackTrace();
    }finally{
        JDBCUtil.close(main.getRs(),main.getStatement(),main.getCon());
    }
    }
}