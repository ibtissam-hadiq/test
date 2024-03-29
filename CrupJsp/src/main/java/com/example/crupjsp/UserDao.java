package com.example.crupjsp;
import java.sql.*;
import java.util.*;




public class UserDao {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://mysql-18566303-ibtissamhadik10-b6f9.a.aivencloud.com:22676/defaultdb";
            String username="avnadmin";
            String password= "AVNS_SM17EivA5McivcoaLJ_";
            con=DriverManager.getConnection(url,username,password);

        }catch(Exception e){
            e.printStackTrace();
        }

        return con;
    }
    public static int save(User u){
        int status=0;

        try{
            Connection con =getConnection();
            PreparedStatement ps= con.prepareStatement("insert into user (name,email,password,sex,country) values (?,?,?,?,?)");
            ps.setString(1,u.getName());
            ps.setString(2,u.getEmail());
            ps.setString(3,u.getPassword());
            ps.setString(4,u.getSex());
            ps.setString(5,u.getCountry());
            status =ps.executeUpdate();
        }catch(Exception e){
           e.printStackTrace();
        }
       return status;
    }
    public static int delete(User u){
        int status=0;
        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("delete from user where id=?");
            ps.setInt(1,u.getId());
            status=ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}

        return status;
    }
    public static List<User> getAllRecords(){
        List<User> list=new ArrayList<User>();

        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("select * from user");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                User u=new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setSex(rs.getString("sex"));
                u.setCountry(rs.getString("country"));
                list.add(u);
            }
        }catch(Exception e){System.out.println(e);}
        return list;
    }
    public static User getRecordById(int id){
        User u=null;
        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("select * from user where id=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                u=new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setPassword(rs.getString("password"));
                u.setEmail(rs.getString("email"));
                u.setSex(rs.getString("sex"));
                u.setCountry(rs.getString("country"));
            }
        }catch(Exception e){System.out.println(e);}
        return u;
    }

}
