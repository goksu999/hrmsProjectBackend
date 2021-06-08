package kodlamaio.hrms.business.adapters.mernisService;

public class PersonForValidateFromMernisService {

	
	private long TCKimlikNo;

	
	String ad;

	
	String soyad;
	
	int dogumYili;

	public PersonForValidateFromMernisService() {
		
		
	}
	
	
	public PersonForValidateFromMernisService(long tCKimlikNo, String ad, String soyad, int dogumYili) {
		super();
		TCKimlikNo = tCKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
	}


	public long getTCKimlikNo() {
		return TCKimlikNo;
	}


	public void setTCKimlikNo(long tCKimlikNo) {
		TCKimlikNo = tCKimlikNo;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getDogumYili() {
		return dogumYili;
	}


	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}


	
}
