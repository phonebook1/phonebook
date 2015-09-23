package cn.thiki.phonebook.persistence;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2015/9/20.
 */
public class PersonsRepository {
    @Test
    public void 查询(){
        getAll();
    }

    //定义接口属性
    private Connection connection;

    /**
     * 获取与数据库的连接;
     */
    private static Connection getConnection(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/phonebook";
        String username = "root";
        String password = "root";
        Connection connection = null;
        try{
            Class.forName(driver);//classLoader，加载对应驱动
            connection = (Connection)DriverManager.getConnection(url,username,password);
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
    protected static Integer getAll(){
        Connection connection = getConnection();//与接口连接
        String sql = "select * from persons ORDER BY id DESC";
        PreparedStatement preparedStatement;
        try{
            preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            int column = resultSet.getMetaData().getColumnCount();
            System.out.println("==========================");
            while (resultSet.next()){
                for (int i = 1; i<=column;i++){
                    System.out.print(resultSet.getString(i)+"\t");
                    if ((i==2)&&(resultSet.getString(i).length()<8)){
                        System.out.print("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("==========================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
