package in.cg.service;

import in.cg.entities.Certificate;
import in.cg.repository.CertificateRepositoryImpl;
import in.cg.repository.ICertificateRepository;


public class CertificateServiceImpl implements ICertificateService{
	
	// Step 1; Establishing connection between Service and Repo
		private ICertificateRepository dao;
		
		public CertificateServiceImpl()
		{
			dao = new CertificateRepositoryImpl();
		}
		

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}


	@Override
	public void deleteCertificate(int id) {
		dao.deleteCertificate(id);
		
	}

	

	

}
