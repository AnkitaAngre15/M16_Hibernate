package in.cg.service;

import in.cg.entities.Admin;


public interface IAdminService 
{
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	Admin findAdmin(Admin admin);
	boolean logOut();
}
