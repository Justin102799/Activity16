package com.example.demo.Service;

import com.example.demo.Entity.TaskEntity;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {
    List<TaskEntity> getAllTasks();
    void saveTask(TaskEntity taskEntity);
    TaskEntity getTaskId(long id);
    void deleteTaskById(long id);
//    Page <TaskEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
