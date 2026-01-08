package com.januaryMonths.day6.oops2;

class Hr {
        String type = "Hr, How are you...";
}

class Software extends Hr {
    String type = "Software engineer..";
    public void employeeSoftwar() {
        System.out.println(super.type);
    }
}

class Admin extends Software {
    String type = "Admin";
    public void employeeAdmin() {
        System.out.println(super.type);
    }
}
public class EmployeeSuperKeyword  extends Admin {
    public static void main(String[] args) {
    Hr hr = new Hr();
    Software software = new Software();
    Admin admin = new Admin();

    software.employeeSoftwar();
    admin.employeeAdmin();

    }
}
