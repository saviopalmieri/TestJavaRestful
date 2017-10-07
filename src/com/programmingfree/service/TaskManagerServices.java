package com.programmingfree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.programmingfree.dao.TaskManagerServiceInterface;
import com.programmingfree.springservice.domain.Task;

@Service("taskManagerServices")
@Transactional
public class TaskManagerServices implements TaskManagerServicesInterface {

	private TaskManagerServiceInterface taskManagerService;

	@Autowired(required=true)
	public void setTaskManagerService(TaskManagerServiceInterface taskManagerService) {
		this.taskManagerService = taskManagerService;
	}

	@Override
	public List<Task> LoadAllTasks() {
		return taskManagerService.LoadAllTasks();
	}

	@Override
	public void saveTask(Task t) {
		taskManagerService.saveTask(t);
	}
	
}
