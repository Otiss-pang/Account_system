package com.ir.account.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

//自动增长的配置类
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",new Date(),metaObject);//这里传递的是JavaBean的实体属性名
        this.setFieldValByName("updateTimes", 0, metaObject);
        this.setFieldValByName("creator", "第二十二组", metaObject);
        this.setFieldValByName("state", 0, metaObject);//未开票
        this.setFieldValByName("receiptStatus", 2, metaObject);//未开票
        this.setFieldValByName("createDate", new Date(), metaObject);
        this.setFieldValByName("rate", 0.0, metaObject);



    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("updateTimes", new Date(), metaObject);
    }
}
