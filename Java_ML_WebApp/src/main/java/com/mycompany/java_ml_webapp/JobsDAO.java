package com.mycompany.java_ml_webapp;

import java.util.List;

/**
 * Data Access Object interface for wuzzuf.com Jobs
 * 
 * @author Omar Safwat
 */
public interface JobsDAO<T> {
    
    public T getAllJobs();
}
