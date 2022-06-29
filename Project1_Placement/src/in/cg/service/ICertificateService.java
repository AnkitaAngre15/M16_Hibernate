package in.cg.service;

import in.cg.entities.Certificate;


public interface ICertificateService {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public void deleteCertificate(int id);
	

}
