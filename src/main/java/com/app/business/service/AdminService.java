package com.app.business.service;

public interface AdminService extends ProjectManagerService {

	public int getCountOfProjectCreatedToday();

	public int getCountOfCollConnectedToday();

	public int getCountOfChefConnectedToday();

}
