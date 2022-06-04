package com.thirdleave.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Data
@TableName("user")
public class UserPO {
    @Id
    private int id;
    @Field("name")
    private String name;
    @Field("age")
    private int age;
}
