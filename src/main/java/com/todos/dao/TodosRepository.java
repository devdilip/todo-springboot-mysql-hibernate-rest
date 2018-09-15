package com.todos.dao;

import org.springframework.data.repository.CrudRepository;

import com.todos.model.Todo;

public interface TodosRepository extends CrudRepository<Todo,Integer>{

}
