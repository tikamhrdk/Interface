///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controllers;
//import daos.EmployeeDAO;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//import javax.naming.spi.DirStateFactory;
//import entities.Employee;
//import org.hibernate.SessionFactory;
///**
// *
// * @author tikamhrdk
// */
//public class EmployeeController {
//    private SessionFactory factory;
//    private EmployeeDAO edao;
//
//    public EmployeeController() {
//    }
//
//    public EmployeeController(SessionFactory factory) {
//        this.factory = factory;
//        this.edao = new EmployeeDAO(factory);
//    }
//     
//    public List<Employee> getAll(){
//        return edao.getAllEmployee();
//    }
//    public List<Employee> getbyId(Object id){
//        return edao.getIdEmployee(id);
//    }
//    public List<Employee> Search(Object data){
//        return  edao.getSearchEmployee(data);
//    }
//        
//    }
//
