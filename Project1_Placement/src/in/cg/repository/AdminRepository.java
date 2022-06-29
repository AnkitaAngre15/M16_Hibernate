package in.cg.repository;

import in.cg.entities.Admin;


public interface AdminRepository {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin deleteAdmin(int id);
	Admin findAdmin(int id);
	void beginTransaction() ;
	void commitTransaction();

}
