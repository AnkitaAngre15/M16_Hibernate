package in.cg.repository;

import in.cg.entities.Certificate;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(int certificateId);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
