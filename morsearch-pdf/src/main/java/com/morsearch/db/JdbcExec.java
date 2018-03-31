package com.morsearch.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by hyt on 2017/12/29.
 */
public class JdbcExec {

    public static void test() {
        Connection conn=JDBCUtil.getConnection();
        System.out.println(conn);
        try {
            PreparedStatement stmt=conn.prepareStatement("select * from Sys_User");
            ResultSet re=stmt.executeQuery();
            while(re.next()){
                String name=re.getString(1);
                System.out.println(name);
            }
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void main(String[] args) {
        test();
    }




    public static Boolean sqlexec(String sql) {
        Connection conn=JDBCUtil.getConnection();
        System.out.println(conn);
        try {
            PreparedStatement stmt=conn.prepareStatement(sql);
            int re=stmt.executeUpdate();
            conn.close();
            return re>0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }






}

