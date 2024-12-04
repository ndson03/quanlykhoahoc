package com.ndson03.quanlykhoahoc.dao;

import java.util.List;

import com.ndson03.quanlykhoahoc.entity.Teacher;

public interface TeacherDao {
	
	public Teacher findByTeacherName(String theTeacherName);
	
	public Teacher findByTeacherId(int id);
	
	public void save(Teacher teacher);
	
	public List<Teacher> findAllTeachers();
	
	public void deleteTeacherById(int id);
	
}
