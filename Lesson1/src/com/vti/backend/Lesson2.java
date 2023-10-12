package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Group;
import com.vti.entity.Position;

import static com.vti.entity.Position.Name.DEV;

public class Lesson2 {
    public void runLesson2_Question1(Account account) {
        if (account.getDepartment() == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        }else
        {
            System.out.println("Phòng ban của nhân viên này là " + account.getDepartment());
        }
    }


    public void runLesson2_Question2(Account account)
    {
        if(account.getGroups().length == 0)
        {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.getGroups().length <= 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.getGroups().length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (account.getGroups().length >= 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public void runLesson2_Question5(Group group)
    {
        switch(group.getAccounts().length){
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Không có thành viên nào");
                break;
        }
    }
    public void runLesson2_Question6(Account account)
    {
        switch (account.getGroups().length){
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            case 4:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
            default:
                System.out.println("Nhân viên này chưa có group");
                break;
        }
    }

    public void runLesson2_Question7(Account account)
    {
        String positionName = String.valueOf(account.getPosition().getName());
        switch(positionName)
        {
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }
    }
}
