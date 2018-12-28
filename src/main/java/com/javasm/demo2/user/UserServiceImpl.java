package com.javasm.demo2.user;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService{

    @Override
    public List<UserModel> selectUser() {
        List<UserModel>list=new ArrayList<UserModel>();
        list.add(new UserModel("小红",11));
        list.add(new UserModel("小绿",12));
        list.add(new UserModel("小紫",13));
        list.add(new UserModel("小黄",14));

//        Map<String,UserModel>map=new HashMap<String, UserModel>(){{
//          put("z",new UserModel());
//          put("z",new UserModel());
//        }
//        };
        return list;
    }
}
