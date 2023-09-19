package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findById =======");
        List<Department> list = departmentDao.findAll();
            for(Department d : list){
                System.out.println(d);
            }

       System.out.println("\n=== TEST 3: insert: ===");
       Department newdepartment = new Department(null, "Dance");
       departmentDao.insert(newdepartment);
       System.out.println("Inserted! New id = " + newdepartment.getId());

        System.out.println("\n=== TEST 4: update =======");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");




        read.close();

    }

}
