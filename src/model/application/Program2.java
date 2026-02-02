package model.application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
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

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Clothes");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department departmentUpdate ===");
        dep = departmentDao.findById(6);
        dep.setName("Music");
        departmentDao.update(dep);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department departmentDelete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.print("Delete completed!");

        sc.close();
    }
}
