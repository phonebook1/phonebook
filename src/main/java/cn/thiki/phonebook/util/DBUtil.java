package cn.thiki.phonebook.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/23.
 */
public class DBUtil {

    private static Connection getConnection(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try{
            Class.forName(driver);//classLoader，加载对应驱动
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 建立获取数据的方法
     */
    public static List<Map<String,Object>> getListMapBySQL(String sql){
        Connection connection = getConnection();//与接口连接
        PreparedStatement preparedStatement;
        List<Map<String,Object>> result=new ArrayList<Map<String, Object>>();
        try{
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            int columnsNumber = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()){
                Map<String,Object> item=new HashMap<String, Object>();
                for (int i = 1; i<=columnsNumber;i++){
                    item.put(resultSet.getMetaData().getColumnName(i),resultSet.getObject(i));
                }
                result.add(item);
            }
        } catch (SQLException e) {
        e.printStackTrace();
        }
        return result;
        }
}
