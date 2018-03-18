/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Data;

import Business.Configure;

/**
 *
 * @author Ruby
 */

import Business.Configure;
import Business.Rssystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author rrheg
 */
public class Databank {

    private static final String FILENAME = "Macintosh HD\\Users\\Ruby\\Documents\\Git\\001833277_001280399_001839227\\Final_Project\\db4o-8.0.249.16098-all-java5.jar"; // path to the data store
    private static Databank databank;
    
    public synchronized static Databank getInstance(){
        if (databank == null){
            databank = new Databank();
        }
        return databank;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Rssystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Rssystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Rssystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<Rssystem> systems = conn.query(Rssystem.class); // Change to the object you want to save
        Rssystem system;
        if (systems.size() == 0){
            system = Configure.configure();  // If there's no Rssystem in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
    
}
