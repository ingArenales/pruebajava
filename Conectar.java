/*
 * aburrido
 */
package Conector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tos
 */
public class Conectar {
    
private static  Connection enlace;
private static final String driver="com.mysql.jdbc.Driver";
private static final String user="root";
private static final String password="12345678";
private static final String url="jdbc:mysq://localhost:3306/prueba";
    
    
    public Conectar(){
        enlace=null;
        try{
            Class.forName(driver);
            enlace = DriverManager.getConnection(url, user,password);
            if(enlace != null){System.out.println("SI CONECTA");}
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("NO CONECTA");
        }
}
}
