package com.morsearch.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hyt on 2017/12/29.
 */
    public class JDBCUtil {

        private static DataSource dataSource=null;
        static{
            dataSource=new ComboPooledDataSource();

        }

        /**
         * 获取数据库连接
         * @return
         */
        public static Connection getConnection(){
            Connection conn=null;
            try {
               conn=dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }


        /**
         * 关闭数据库连接
         * @param conn
         */
        public static void closeConn(Connection conn){
            try {
                if(conn!=null && conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }







    }
