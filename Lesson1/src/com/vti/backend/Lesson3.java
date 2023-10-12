package com.vti.backend;

import com.vti.entity.Department;
import com.vti.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson3 {
    public static List<Department> inputDepartmentList()
    {
        List<Department> departmentList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a department (or 'exit' to quit): ");
            String departmentInputName = ScannerUtils.inputString();

            if (departmentInputName.equalsIgnoreCase("exit")) {
                break;
            }

            Department department = new Department(departmentInputName);
           // department.setId(departmentList.size());

            departmentList.add(department);
        }

        return departmentList;
    }

    public static void printDepartment(List<Department> departmentList)
    {
        for(Department d : departmentList)
        {
            System.out.println(d);
        }
    }
}
