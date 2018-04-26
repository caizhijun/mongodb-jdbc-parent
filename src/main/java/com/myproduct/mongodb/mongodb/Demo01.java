package com.myproduct.mongodb.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.myproduct.mongodb.dao.MongoDao;
import com.myproduct.mongodb.dao.MongoDaoImpl.MongoDaoImpl;
import com.myproduct.mongodb.utils.MongodbJDBC;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author Caizhijun
 * @Date 2018-04-25 15:40
 **/
public class Demo01 {
    public static void main(String[] args) {
        MongoDatabase mongoDatabase = MongodbJDBC.getDatebase();
        if(null!=mongoDatabase){
            System.out.println("连接成功！");
            MongoCollection collection = mongoDatabase.getCollection("movie");

            MongoDaoImpl mongoDao = new MongoDaoImpl();

            Document document = new Document();
            document.put("name","insertMongodb");
            mongoDao.insert(mongoDatabase,"movie",document);
        }
    }
}
