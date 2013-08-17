package model;


public abstract class User 
{
	protected int iduser;
	protected String identityCard;
	protected String username;
	protected String LastName;
	protected String DeliveryAddress;
	protected String CreditNumber;
	protected boolean Limited;
	private boolean IsActive;
	
	
	public User()
	{
		
	}
	
	public User(String identity, String name , String lname , String address , String cnumber)
	{
		this.username = name;
		this.LastName = lname;
		this.DeliveryAddress = address;
		this.CreditNumber = cnumber;
		this.identityCard = identity;
		
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDeliveryAddress() {
		return DeliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		DeliveryAddress = deliveryAddress;
	}

	public String getCreditNumber() {
		return CreditNumber;
	}

	public void setCreditNumber(String creditNumber) {
		CreditNumber = creditNumber;
	}

	public boolean isLimited() {
		return Limited;
	}

	public void setLimited(boolean limited) {
		Limited = limited;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}

	public String toString() 
	{
		return  "ID = " + identityCard + "\nFull Name = " + username + " " + LastName
				+ "\nDeliveryAddress = " + DeliveryAddress + "\nCreditNumber = "
				+ CreditNumber + "\nLimitedUser=" + Limited;
	}
	

}
