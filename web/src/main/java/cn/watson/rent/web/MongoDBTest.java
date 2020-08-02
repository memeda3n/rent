package cn.watson.rent.web;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Arrays;

public class MongoDBTest {

    public MongoTemplate mongoTemplate;

    public void find() {

        Query query = new Query(Criteria.where("age").gt(10));
        query.fields().include("age").include("a").exclude("x");//返回的字段包含 age 和  不包含 x
        mongoTemplate.find(query, Object.class, "name");


        Query query1 = new Query(Criteria.where("age").nin(Arrays.asList(12, 23)));//不在集合中
        Query query2 = new Query(Criteria.where("age").in(Arrays.asList(12, 23)));//在集合中
        Query query3 = new Query(Criteria.where("age").mod(1, 2));//对x取模1，余数等于2的值返回

        new Query(Criteria.where("dd").exists(true).regex("dd").not());//查询键存在并且不是dd的数据

        new Query(Criteria.where("dd").all(Arrays.asList(123, 233)));//查询集合中，数据包含123,233的
        new Query(Criteria.where("dd").size(12));//dd集合的size大于12的
        new Query().fields().slice("arrayName", 20, 12);//对文档中的数组进行分割，截取一个数组，起始20，size为12


    }


}
