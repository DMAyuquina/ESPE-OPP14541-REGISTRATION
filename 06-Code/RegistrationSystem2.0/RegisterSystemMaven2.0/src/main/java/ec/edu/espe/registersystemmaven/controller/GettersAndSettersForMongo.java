/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.registersystemmaven.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public interface GettersAndSettersForMongo {
    public Object get(MongoCollection<Document> mongoCollection, String key, String data);
}
