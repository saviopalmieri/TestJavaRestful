package com.programmingfree.dao;

import java.util.List;

import com.programmingfree.springservice.domain.Task;

public interface TaskManagerServiceInterface {
	List<Task> LoadAllTasks();
}
