package Assignment3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class DetailsMain {
    public static void main(String[] args) {
        List<EmployeeDetails> employee = Arrays.asList(new EmployeeDetails("Eswar","N","1234567890","chidnc99@gmail.com","Tirupati","India"),
                new EmployeeDetails("Sai","S","1234569990","Sai@gmail.com","Tirupati","India"),
                new EmployeeDetails("Claws","C","2134678890","Claws123@gmail.com","Nellore","India"),
                new EmployeeDetails("Babu","B","1234567800","Babu@gmail.com","Tirupati","India"),
                new EmployeeDetails("kumar","K","1233557890","kumaat45@gmail.com","hyd","India"),
                new EmployeeDetails("Mani","M","1233678908","Main@gmail.com","Rajamundry","India"),
                new EmployeeDetails("Mike","M","1233355778","Mike@gamil.com","Hyd","India"));


        System.out.println("the user details="+(employee));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter phonenumber");
        String phonenumber1 = sc1.next();

        for (EmployeeDetails i:employee)
        {
            if(phonenumber1.equals(i.phoneNumber))
            {
                System.out.println("user details="+i.firstName +" " +i.lastName +" "+i.address +" "+i.country +" " +i.email);
            }
        }


    }
}
