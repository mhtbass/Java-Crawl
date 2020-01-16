package com.head.head.quickstart;

public class Not {

	private String ihaleNo , ihaleNitelik,ihaleYer,ihaleTür;

	@Override
	public String toString() {
		return "İhale Kayıt No=" + ihaleNo + ","+"\n"
				+ "Niteliği, Türü ve Miktarı=" + ihaleNitelik + ", "+"\n"
						+ "İhalenin Yapılacağı Yer / Başvuru Adresi=" + ihaleYer + ", "+"\n"
								+ "İhale Türü=" + ihaleTür + ""+"\n"+
						"--------------------------------------------------------------";
	}

	public Not() {
		
	}
	
	public Not(String ihaleNo, String ihaleNitelik, String ihaleYer, String ihaleTür) {
		 
		this.ihaleNo = ihaleNo;
		this.ihaleNitelik = ihaleNitelik;
		this.ihaleYer = ihaleYer;
		this.ihaleTür = ihaleTür;
		
	}

	public String getIhaleNo() {
		return ihaleNo;
	}

	public void setIhaleNo(String ihaleNo) {
		this.ihaleNo = ihaleNo;
	}

	public String getIhaleNitelik() {
		return ihaleNitelik;
	}

	public void setIhaleNitelik(String ihaleNitelik) {
		this.ihaleNitelik = ihaleNitelik;
	}

	public String getIhaleYer() {
		return ihaleYer;
	}

	public void setIhaleYer(String ihaleYer) {
		this.ihaleYer = ihaleYer;
	}

	public String getIhaleTür() {
		return ihaleTür;
	}

	public void setIhaleTür(String ihaleTür) {
		this.ihaleTür = ihaleTür;
	}

	
	
	
}
