package com.LMS.ssh.service;

import org.hibernate.HibernateException;

import com.LMS.ssh.beans.User;
import com.LMS.ssh.forms.UserForm;

public interface UserManager {

	public void regUser(UserForm userForm) throws HibernateException, InterruptedException;
	public boolean loginUser(UserForm userForm) throws HibernateException, InterruptedException;
	public User findUser(UserForm userForm) throws HibernateException, InterruptedException;
	
}
