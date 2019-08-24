
package controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.lawyer;


public class LawyerUsercontrol {
    lawyer lawyer = new lawyer();
    Statement statement ;
    public void insert(lawyer lawyer){
        try {
            statement=DBConection.getConnection().createStatement();
            statement.executeUpdate( "insert into lawyer(lawyer_id,first_name,last_name,"
                    + "ssn,phone,address,email,age,password)"
                    + "values('"+lawyer.getLawyer_id()+"' ,"
                + "'"+lawyer.getFirst_name() +"',"
                   + "'"+lawyer.getLast_name()+"',"
                     + "'"+ lawyer.getSsn()+"','"+ lawyer.getPhone()+"',"
                    + "'"+ lawyer.getAddress()+"','"+ lawyer.getEmail()+"',"
                 + ""+ lawyer.getAge()+" ,'"+ lawyer.getPassword()+"'  )");
        } catch (SQLException ex) {
            Logger.getLogger(LawyerUsercontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public lawyer search (String ssn){
        lawyer lawyer = new lawyer();
        try {
             statement=DBConection.getConnection().createStatement();
            ResultSet resultSet= statement.executeQuery("select * from lawyer where ssn = '"+ssn+"' ");
             resultSet.beforeFirst();
           while(resultSet.next()){
               lawyer.setLawyer_id(resultSet.getString(1));
               lawyer.setFirst_name(resultSet.getString(2));
               lawyer.setLast_name(resultSet.getString(3));
               lawyer.setSsn(resultSet.getString(4));
               lawyer.setPhone(resultSet.getString(5));
               lawyer.setAddress(resultSet.getString(6));
               lawyer.setEmail(resultSet.getString(7));
               lawyer.setAge(resultSet.getInt(8));
               lawyer.setPassword(resultSet.getString(9));
               JOptionPane.showMessageDialog(null , "found");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(LawyerUsercontrol.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        return lawyer;
    }
    
       public void update (lawyer lawy){
        try {
            statement = DBConection.getConnection().createStatement();
            String sql=("UPDATE `lawyer` SET `lawyer_id`='"+lawy.getLawyer_id()+"',"
                   + "`first_name`='"+lawy.getFirst_name()+"',`last_name`='"+lawy.getLast_name()+"',"
                   + "`phone`='"+lawy.getPhone()+"',`address`='"+lawy.getAddress()+"',`email`='"+lawy.getEmail()+"',"
                   + "`age`='"+lawy.getAge()+"',"
                           + "`password`='"+lawy.getPassword()+"' WHERE ssn='"+lawy.getSsn()+"' ");
            System.out.println(sql);
           statement.executeUpdate(sql); 
            

        } catch (SQLException ex) {
            Logger.getLogger(LawyerUsercontrol.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
       }
       public static void main(String[] args) {
        lawyer l=new lawyer();
        l.setLawyer_id("5");
        l.setFirst_name("hanan");
        l.setLast_name("lkjh");
        l.setSsn("51234567897654");
        l.setPhone("01234567895");
        l.setAddress("lkjhgf");
        l.setEmail("kjhgf@gmail.com");
        l.setAge(21);
        l.setPassword("sdfg1234");
        new LawyerUsercontrol().update(l);
           
        
    }
       
}
