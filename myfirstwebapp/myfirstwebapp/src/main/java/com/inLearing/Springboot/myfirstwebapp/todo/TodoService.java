package com.inLearing.Springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<>();
	static {
		todos.add(new Todo(1, "Rajesh", "Learning Full stack", LocalDate.now().plusYears(1), false)); 
		todos.add(new Todo(2, "A", "HTML", LocalDate.now().plusYears(2), false)); 
		todos.add(new Todo(3, "B", "CSS", LocalDate.now().plusYears(3), false)); 
		todos.add(new Todo(4, "C", "Java", LocalDate.now().plusYears(4), false)); 
		todos.add(new Todo(5, "D", "React", LocalDate.now().plusYears(5), false)); 
	}
	public List<Todo> findByUsername(String userNamse){
		return todos;
		
	}
}
