package com.example.web;

import com.example.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    //创建 同步 线程安全
    static Map<Long,User>map= Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User>list=new ArrayList<>(map.values());
        return list;
    }

    @RequestMapping(value = "/",method=RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        map.put(user.getId(),user);
        return "success";
    }

    @RequestMapping(value = "/{id}",method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id,@ModelAttribute User user){
        User u=map.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        map.put(id,u);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delUser(@PathVariable Long id){
        map.remove(id);
        return "success";
    }
}
