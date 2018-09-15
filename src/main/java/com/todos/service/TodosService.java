package com.todos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todos.dao.TodosRepository;
import com.todos.model.Todo;

@Service
@Transactional
public class TodosService {

	private final TodosRepository todosRepository;

	public TodosService(TodosRepository todosRepository) {
		this.todosRepository = todosRepository;
	}

	public List<Todo> findAll() {
		List<Todo> todos = new ArrayList<>();
		for (Todo todo : todosRepository.findAll()) {
			todos.add(todo);
		}
		return todos;
	}

	public void save(Todo todo) {
		todosRepository.save(todo);
	}

	public void delete(int id) {
		Optional<Todo> todo = todosRepository.findById(id);
		todosRepository.delete(todo.get());
	}
	public Optional<Todo> findTodo(int id) {
		return todosRepository.findById(id);
	}

}
