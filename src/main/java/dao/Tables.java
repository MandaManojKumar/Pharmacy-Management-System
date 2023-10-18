/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author MANDA MANOJ KUMAR
 */
public class Tables {
    public static void main(String args[]){
        try{
            Connection con= ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
           // st.executeUpdate("Create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobilenumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
           // st.executeUpdate("Insert into appuser(userRole,name,dob,mobilenumber,email,username,password,address) values('Admin','Admin','16-12-1992','1234567890','admin@email.com','admin','admin','India')");
           // st.executeUpdate("Insert into appuser(userRole,name,dob,mobilenumber,email,username,password,address) values('Admin','manoj','06-09-2002','1234567890','manoj@email.com','manoj','manoj','India')");
          //  st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueID varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
          //st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");  
          //    st.executeUpdate("create table diplay (dis_pk int AUTO_INCREMENT primary key, billId varchar(200))");
          //  st.executeUpdate("create table display(dis_pk int AUTO_INCREMENT primary key,billId varchar(200),totalPaid bigint,generatedby varchar(50))");
            
            st.executeUpdate("create table displays(dis_pk int AUTO_INCREMENT primary key,billId varchar(200),totalPaid bigint,generatedby varchar(50),patientName varchar(50))");
          JOptionPane.showMessageDialog(null,"Table Created Successfully");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
