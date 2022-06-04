package com.thirdleave.rest;

import com.thirdleave.po.UserPO;
import com.thirdleave.service.UserService;
import com.thirdleave.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/test")
public class Test {

    @Autowired
    private UserService userService;
    @Autowired
    public MongoTemplate mongoTemplate;

    @GetMapping("/save")
    public String save() {
        Map<String, Object> map = new HashMap<>();
        map.put("_id", "id_1");
        map.put("name", "王京");
        map.put("age", "18");
        mongoTemplate.save(map, "thirdleave");
        return "新增成功";
    }

    @GetMapping("/hello")
    public String hello() {
        RedisUtils.set("name", "thirdleave");
        RedisUtils.get("name");
        List<UserPO> userPOS = userService.queryAllUser();
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is("id_1"));
        Map<?, ?> resutl = this.mongoTemplate.findOne(query, Map.class, "thirdleave");
        return (String) resutl.get("name");
    }
}
