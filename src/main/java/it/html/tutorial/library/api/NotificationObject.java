package it.html.tutorial.library.api;

public class NotificationObject {
	
	public String rn; //resourceName
	public int ty; //type
	public String pi; //parentIdentifier
	public String ri; //requestIdentifier
	public String ct; //creationTime
	public String lt; //lastModifiedTime
	public int st; //stateTag
	public String et; //expirationTime
	public int cs; //creatorState
	public int con; //content
	public String cr; //creator
	
	public NotificationObject()	{
		
	}

	public NotificationObject(String resourceName, int type, String parentIdentifier, String requestIdentifier,
			String creationTime, String lastModifiedTime, int stateTag, String expirationTime, int cs, int content,
			String creator) {
		super();
		this.rn = resourceName;
		this.ty = type;
		this.pi = parentIdentifier;
		this.ri = requestIdentifier;
		this.ct = creationTime;
		this.lt = lastModifiedTime;
		this.st = stateTag;
		this.et = expirationTime;
		this.cs = cs;
		this.con = content;
		this.cr = creator;
	}

	public String getResourceName() {
		return rn;
	}

	public void setResourceName(String resourceName) {
		this.rn = resourceName;
	}

	public int getType() {
		return ty;
	}

	public void setType(int type) {
		this.ty = type;
	}

	public String getParentIdentifier() {
		return pi;
	}

	public void setParentIdentifier(String parentIdentifier) {
		this.pi = parentIdentifier;
	}

	public String getRequestIdentifier() {
		return ri;
	}

	public void setRequestIdentifier(String requestIdentifier) {
		this.ri = requestIdentifier;
	}

	public String getCreationTime() {
		return ct;
	}

	public void setCreationTime(String creationTime) {
		this.ct = creationTime;
	}

	public String getLastModifiedTime() {
		return lt;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lt = lastModifiedTime;
	}

	public int getStateTag() {
		return st;
	}

	public void setStateTag(int stateTag) {
		this.st = stateTag;
	}

	public String getExpirationTime() {
		return et;
	}

	public void setExpirationTime(String expirationTime) {
		this.et = expirationTime;
	}

	public int getCs() {
		return cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public int getContent() {
		return con;
	}

	public void setContent(int content) {
		this.con = content;
	}

	public String getCreator() {
		return cr;
	}

	public void setCreator(String creator) {
		this.cr = creator;
	}

	@Override
	public String toString() {
		return "NotificationObject [resourceName=" + rn + ", type=" + ty + ", parentIdentifier="
				+ pi + ", requestIdentifier=" + ri + ", creationTime=" + ct
				+ ", lastModifiedTime=" + lt + ", stateTag=" + st + ", expirationTime="
				+ et + ", cs=" + cs + ", content=" + con + ", creator=" + cr + "]";
	}
	
}
