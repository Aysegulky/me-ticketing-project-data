package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    //save,update,delete,show all task, give me certain task

    List<TaskDTO> listAllTasks();
    void save(TaskDTO dto);
    void update (TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);
    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);



}
