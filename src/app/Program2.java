package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert: ===");

        Department newdepartment = new Department(null, "Dance");
        departmentDao.insert(newdepartment);
        System.out.println("Inserted! New id = " + newdepartment.getId());



        read.close();

    }

}
