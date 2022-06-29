package in.cg.service;

import in.cg.entities.College;
import in.cg.entities.Placement;


public interface ICollegeService {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollegeById(int id);
	public College deleteCollege(College college);
	public Placement schedulePlacement(Placement placement);
	

}
