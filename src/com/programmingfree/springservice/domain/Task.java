package com.programmingfree.springservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task_list")
public class Task {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "task_id")
	  private int task_id;
	  
	  @Column(name = "task_name")
	  private String task_name;
	  
	  @Column(name = "task_description")
	  private String task_description; 
	  
	  @Column(name = "task_priority")
	  private String task_priority;
	  
	  @Column(name = "task_status")
	  private String task_status;
	  
	  public int getTaskId() {
	   return task_id;
	  }
	  
	  public void setTaskId(int taskId) {
	   this.task_id = taskId;
	  }
	  
	  public String getTaskName() {
	   return task_name;
	  }
	  
	  public void setTaskName(String taskName) {
	   this.task_name = taskName;
	  }
	  
	  public String getTaskDescription() {
	   return task_description;
	  }
	  
	  public void setTaskDescription(String taskDescription) {
	   this.task_description = taskDescription;
	  }
	  
	  public String getTaskPriority() {
	   return task_priority;
	  }
	  
	  public void setTaskPriority(String taskPriority) {
	   this.task_priority = taskPriority;
	  }
	  
	  public String getTaskStatus() {
	   return task_status;
	  }
	  
	 public void setTaskStatus(String taskStatus) {
	   this.task_status = taskStatus;
	  }
	 
	  @Override
	  public String toString() {
	   return "Task [task_id=" + task_id + ", task_name=" + task_name
	     + ", task_description=" + task_description + ", task_priority="
	     + task_priority +",task_status="+task_status+ "]";
	  }


}
