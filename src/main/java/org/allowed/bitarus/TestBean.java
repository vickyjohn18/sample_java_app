/*
mkdir -p src/main/java/org/allowed/bitarus
kate src/main/java/org/allowed/bitarus/TestBean.java
*/
package org.allowed.bitarus;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestBean{
    private String name;
    private Logger logger;
    
    public TestBean(){
        this.logger = Logger.getLogger(this.getClass().getName() );
        this.logger.log(Level.INFO,"Created test bean");
        this.name="Ioooo";
    }   
    
    public String getName(){
        this.logger.info("getName called");
        return this.name;        
    }
    
    public void setName(String name){
        this.name=name;        
    }
}
