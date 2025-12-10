package com.demo.service;
import com.demo.beans.*;

public interface LoginService {

	MyUser validateUser(String uname, String passwd);

}
