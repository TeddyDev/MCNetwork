package me.lukebingham.core.database;

import com.mongodb.DBCollection;

/**
 * Created by LukeBingham on 26/02/2017.
 */
public interface Database {
    DBCollection getCollection(String database, String collection);
}
