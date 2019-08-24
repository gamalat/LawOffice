package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.IssueClass;

public class IssueLawyer {

    Statement sta;

    public void insert(IssueClass issue) {
        try {
            sta = DBConection.getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = ("INSERT INTO `issues`(`issues_num`, `name`, `type`,"
                + " `date_of_judgment`, `description`, `lawyer_id`, `report`, "
                + "`comment`, `status`) VALUES ('" + issue.getIssues_num() + "','" + issue.getName() + "','" + issue.getType() + "',"
                + "'" + issue.getDate_of_judgment() + "','" + issue.getDescription() + "','" + issue.getLawyer_id() + "','" + issue.getReport() + "',"
                + "'" + issue.getComment() + "','" + issue.getStatus() + "')");
        System.out.println(sql);
        try {
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update(IssueClass issue) {
        try {
            sta = DBConection.getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = ("UPDATE `issues` SET  `name`='" + issue.getName() + "',`type`='" + issue.getType() + "',`date_of_judgment`='" + issue.getDate_of_judgment() + "',"
                + "`description`='" + issue.getDescription() + "',`lawyer_id`='" + issue.getLawyer_id() + "',`report`='" + issue.getReport() + "',"
                + "`comment`='" + issue.getComment() + "',`status`='" + issue.getStatus() + "' WHERE issues_num='" + issue.getIssues_num() + "'");
        System.out.println(sql);
        try {
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /////////////////////////////////////////////////////////
    public void delete(String issues_num) {
        try {
            sta = DBConection.getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = ("delete FROM `issues` WHERE issues_num='" + issues_num + "'");
        System.out.println(sql);
        try {
            sta.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ObservableList<IssueClass> view() {
        ObservableList<IssueClass> data = FXCollections.observableArrayList();
        ResultSet resultSet = null ;
        IssueClass u = new IssueClass();
        try {

            sta = DBConection.getConnection().createStatement();
            
           resultSet= sta.executeQuery("SELECT * FROM `issues` ");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                u.setIssues_num(resultSet.getString(1));
                u.setName(resultSet.getString(2));
                u.setType(resultSet.getString(3));
                u.setDate_of_judgment(resultSet.getString(4));
                u.setDescription(resultSet.getString(5));
                u.setLawyer_id(resultSet.getString(6));
                u.setReport(resultSet.getString(7));
                u.setComment(resultSet.getString(8));
                u.setStatus(resultSet.getString(9));
                data.add(u);
                System.out.println(resultSet.getString(1));

            }

        } catch (SQLException ex) {
            Logger.getLogger(IssueLawyer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public static void main(String[] args) throws SQLException {
        IssueClass is = new IssueClass();
        is.setIssues_num("3");
        is.setName("a7kam");
        is.setType("ssssstyussssss");
        is.setDate_of_judgment("2017-11-26");
        is.setDescription("dddhhhhhhhhhhhhhhhhfffffffffsssssssssss");
        is.setReport("rrlkjccccc");
        is.setStatus("qqygfdqqqqq");
        new IssueLawyer().view();

    }

}
