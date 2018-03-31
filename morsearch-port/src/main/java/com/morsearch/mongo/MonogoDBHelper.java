package com.morsearch.mongo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * mongodb数据库操作工具类
 * @author shimingbo
 * @since 2017/6/8
 */
public class MonogoDBHelper {

	public static Datastore getDatastore(){
		ServerAddress addr = new ServerAddress(MonogoDBSetting.getSetting("mongo.host"),
				Integer.parseInt(MonogoDBSetting.getSetting("mongo.port")));
		List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
		MongoCredential credentia = MongoCredential.createCredential(
				MonogoDBSetting.getSetting("mongo.username"),
				MonogoDBSetting.getSetting("mongo.dbname"),
				MonogoDBSetting.getSetting("mongo.pwd").toCharArray());
		credentialsList.add(credentia);
		MongoClient mongo = new MongoClient(addr, credentialsList);
		Morphia morphia = new Morphia();

		// tell Morphia where to find your classes
		// can be called multiple times with different packages or classes
		morphia.mapPackage(MonogoDBSetting.getSetting("mongo.map_package"));

		// create the Datastore connecting to the default port on the local host
		Datastore datastore = morphia.createDatastore(mongo, MonogoDBSetting.getSetting("mongo.dbname"));
		datastore.ensureIndexes();
		return datastore;
	}

	public static void main( String[] args )
    {
		Morphia morphia = new Morphia();
		//方式1
		ServerAddress addr = new ServerAddress("172.21.31.250", 27017);
		List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
		MongoCredential credentia = MongoCredential.createCredential(
		    "morsearch", "morsearch", "morsearch258".toCharArray());
		credentialsList.add(credentia);
		MongoClient client = new MongoClient(addr, credentialsList);

		addadmin();
		addopertion();
    }

/*测试admin登录日志*/
	public static void addadmin(){
		//this.getRequest().getRemoteAddr()
		//记录登陆日志
		AdminLoginLog loginLog = new AdminLoginLog();
		loginLog.setUserid("tt");
		loginLog.setUsername("tt");
		loginLog.setLoginip("tt");
		loginLog.setLogintime(new Date());
		try{
			Datastore datastore = MonogoDBHelper.getDatastore();
			datastore.save(loginLog);

		}catch(Exception e){
			e.printStackTrace();
		}
	};

	/*测试操作日志*/
	public static void addopertion(){
		//this.getRequest().getRemoteAddr()
		//记录登陆日志
		OpertionLog log = new OpertionLog();
		log.setUserid("11");
		log.setUsername("11");
		log.setMenuName("11");
		log.setOpertionType("11");
		log.setOpertionContent("11");
		log.setLogTime(new Date());
		Datastore datastore = MonogoDBHelper.getDatastore();
		datastore.save(log);

	};


}
