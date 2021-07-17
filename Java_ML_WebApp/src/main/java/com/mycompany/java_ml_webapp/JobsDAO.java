package com.mycompany.java_ml_webapp;

import java.util.List;

/**
 * Data Access Object interface for wuzzuf.com Jobs
 * 
 * @author Omar Safwat
 */
public interface JobsDAO {
    
    public List<Job> getAllJobs();
    
    public Job getJob(int index);
    
    // Method updates a record in DataFrame with "job"
    public void updateJob(Job job);
    
    // Method removes record holding "job" from the DataFrame
    public void deleteJob(Job job);
}
