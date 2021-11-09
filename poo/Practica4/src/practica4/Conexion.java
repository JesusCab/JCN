package practica4;
import java.sql.*;

/**
 *
 * @author jesus
 */
public class Conexion {
   private static Connection cnx = null;
   
   public static Connection obtener() throws SQLException, ClassNotFoundException{
       if(cnx == null){
           try{
               Class.forName("com.mysql.jdbc.Driver");
               cnx = DriverManager.getConnection("jdbc:mysql://localhost/basel","root","bubba");
           }catch(SQLException ex){
               throw new SQLException(ex);
             }
       }   
      
     return cnx;
    }
   
   public static void cerrar() throws SQLException{
       if(cnx!=null){
           cnx.close();
       }
   }
}
