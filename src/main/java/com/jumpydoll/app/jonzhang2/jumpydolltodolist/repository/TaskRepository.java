package com.jumpydoll.app.jonzhang2.jumpydolltodolist.repository;

import com.jumpydoll.app.jonzhang2.jumpydolltodolist.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
