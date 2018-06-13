package com.onebox.backend.service;

import com.onebox.backend.entity.UUser;

public interface UUserService {
	
	public int countUUsers();
	
	public String getUUsers();
	
	public String findUUser(String id);
	
	public String insert(UUser uuser);
	
	public String update(String hash, String name, String image, String id);
	
	public String validate(String email, String hash);

}
