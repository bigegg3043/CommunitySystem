package com.egg.service.factory;

import com.egg.dao.impl.CParkDaoImpl;
import com.egg.dao.impl.FloorDaoImpl;
import com.egg.dao.impl.OwnerDaoImpl;
import com.egg.dao.impl.UserDaoImpl;
import com.egg.service.impl.CParkServiceImpl;
import com.egg.service.impl.FloorServiceImpl;
import com.egg.service.impl.OwnerServiceImpl;
import com.egg.service.impl.UserServiceImpl;

public class ServiceFactory {
    public static Object getInter(String s){
        switch (s){
            case "USER":
                return new UserServiceImpl();
            case "FLOOR":
                return new FloorServiceImpl();
            case "OWNER":
                return new OwnerServiceImpl();
            case "C_PARK":
                return new CParkServiceImpl();
            default:
                return null;
        }
    }
}
