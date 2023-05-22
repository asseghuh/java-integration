package mongoClient;
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by shengR on 2023/3/2
 * @desc: todo
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建服务地址
        ServerAddress serverAddress = new ServerAddress("172.24.226.5", 20017);
        //创建凭证，三个参数：用户名，验证库，密码
        MongoCredential mc = MongoCredential.createScramSha1Credential("pubuser","admin","KAov0XvKeFPVrF+4+rz-6P49B9U6Rz".toCharArray());
        //创建客户端连接选项
        MongoClientOptions options = MongoClientOptions.builder()
                //设置连接超时时间为10s
                .connectTimeout(1000*10)
                //设置最长等待时间为10s
                .maxWaitTime(1000*10)
                .build();
        //创建客户端，其中可选参数options,用于设置连接所需的配置信息
        MongoClient client = new MongoClient(serverAddress,mc,options);

        //获取数据库，没有则创建
        MongoDatabase db = client.getDatabase("test");
        //获取集合，没有则创建
        MongoCollection<Document> teacher = db.getCollection("teacher");

        //一，查询数据
        //全量查询
        FindIterable<Document> result1 = teacher.find();
        //条件查询1 :过滤name为shengr的文档
        FindIterable<Document> result2 = teacher.find(Filters.eq("name", "shengr"));
        //条件查询2 ：过滤课程中同时包含Math和China的文档
        BasicDBObject query = new BasicDBObject("courses", new BasicDBObject("$elemMatch", new BasicDBObject("$eq", "Math").append("$eq","China")));
        FindIterable<Document> result3 = teacher.find(query);
        //遍历结果
        MongoCursor<Document> iterator = result2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //二，插入数据（基本数据以及数组示范）
        Document d1=new Document();
        List<String> coursesList=new ArrayList<>();
        coursesList.add("Math");
        coursesList.add("English");
        coursesList.add("China");
        d1.append("name","shengr").append("age","26").append("addr","sz").append("courses",coursesList);
        teacher.insertOne(d1);

        //三，更新数据,updateOne为修改查到的第一条，updateMany修改查到的全部数据
        teacher.updateOne(Filters.eq("name", "shengr"), new Document("$set", new Document("name", "asseghuh")));
        teacher.updateMany(Filters.eq("name", "shengr"), new Document("$set", new Document("name", "asseghuh")));

        //findOneAndUpdate用法示例1，该方法默认返回修改前的数据，且没有匹配的不会新增，可以设置如下选项更改默认行为
        FindOneAndUpdateOptions findOneAndUpdateOptions = new FindOneAndUpdateOptions()
                .returnDocument(ReturnDocument.AFTER)
                .upsert(true);

        Document d=new Document()
                .append("$set", new Document("addr", "shanghai"))
                .append("$set",new Document("age","99").append("updateTime",new Date()).append("flag","1"));

        Document result = teacher.findOneAndUpdate(Filters.eq("name", "ggg"), d, findOneAndUpdateOptions);

        //findOneAndUpdate用法示例2，该方法默认返回修改前的数据，且没有匹配的不会新增，可以设置如下选项更改默认行为
        BasicDBObject query1 = new BasicDBObject("uuid_list", new BasicDBObject("$elemMatch", new BasicDBObject("$eq","_21331")));
        Bson update = new Document()
                .append("$addToSet", new Document("uuid_list","_21331"))
                .append("$set", new Document("first_value", new Date()).append("last_value", new Date()));
        Document res = teacher.findOneAndUpdate(query1, update, findOneAndUpdateOptions);
        System.out.println("Test-arr:"+res);

        //四，删除操作,one和many的区别同上
        teacher.deleteOne(Filters.eq("name", "aaaaa"));
        teacher.deleteMany(Filters.eq("name", "bbbbb"));

    }
}
