package com.techproed.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    //Create a method to get data from DataProvider
    //return type of the method is 2d object


    @DataProvider
    public Object[][] getData() {
        //manager Manager1
        //manager Manager2
        //manager Manager3

// one way to add data
//        Object[][] managerProfile = new Object[3][2];
//        //1st row
//        managerProfile[0][0]="manager";
//        managerProfile[0][1]="Manager1";
//
//        //2nd row
//        managerProfile[1][0]="manager2";
//        managerProfile[1][1]="Manager2";
//
//        //3rd row
//        managerProfile[2][0]="manager3";
//        managerProfile[2][1]="Manager3";


        //second way

        Object [][] managerProfile={
                {"manager","Manager1"},
                {"manager2","Manager2"},
                {"manager3","Manager3"}
        };

        return managerProfile;
    }

    @Test(dataProvider="getData")
    public void managerInfo(String userName, String password) {

        System.out.println("User Name: " + userName + "\nPassword: " + password);


    }
}
