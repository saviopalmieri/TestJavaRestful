package com.programmingfree.service;

import java.util.List;

import com.programmingfree.springservice.domain.Task;

public interface TaskManagerServicesInterface {
	List<Task> LoadAllTasks();
}
