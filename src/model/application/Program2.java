package model.application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        List<Department> list = new ArrayList<>();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(2);

        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }
}
