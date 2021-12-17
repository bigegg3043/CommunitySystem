package com.egg.dao.factory;

import com.egg.dao.impl.CParkDaoImpl;
import com.egg.dao.impl.FloorDaoImpl;
import com.egg.dao.impl.OwnerDaoImpl;
import com.egg.dao.impl.UserDaoImpl;
import com.egg.dao.pojo.Owner;
import com.egg.service.impl.UserServiceImpl;

public class DaoFactory {
    public static Object getInter(String s){
        switch (s){
            case "USER":
                return new UserDaoImpl();
            case "FLOOR":
                return new FloorDaoImpl();
            case "OWNER":
                return new OwnerDaoImpl();
            case "C_PARK":
                return new CParkDaoImpl();
            default:
                return null;
        }
    }
}
