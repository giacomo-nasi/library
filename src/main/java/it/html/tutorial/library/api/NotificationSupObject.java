package it.html.tutorial.library.api;

public class NotificationSupObject {
	
	public String m2m;
	public NotificationObject nObj;
	
	public NotificationSupObject() {
		
	}
	
	public NotificationSupObject(String m2m, NotificationObject nObj) {
		super();
		this.m2m = m2m;
		this.nObj = nObj;
	}

	public String getM2m() {
		return m2m;
	}

	public void setM2m(String m2m) {
		this.m2m = m2m;
	}

	public NotificationObject getnObj() {
		return nObj;
	}

	public void setnObj(NotificationObject nObj) {
		this.nObj = nObj;
	}

	@Override
	public String toString() {
		return "NotificationsSupObject [m2m=" + m2m + ", nObj=" + nObj + "]";
	}
}
