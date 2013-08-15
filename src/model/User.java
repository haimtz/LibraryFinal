package model;


public abstract class User 
{
	protected String ID;
	protected String Name;
	protected String LastName;
	protected String DeliveryAddress;
	protected String CreditNumber;
	protected boolean Limited;
	private boolean IsActive;
	
	
	public User()
	{
		
	}
	
	public User(String name , String lname , String address , String cnumber)
	{
		Name = name;
		LastName = lname;
		DeliveryAddress = address;
		CreditNumber = cnumber;
		
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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
		return  "ID = " + ID + "\nFull Name = " + Name + " " + LastName
				+ "\nDeliveryAddress = " + DeliveryAddress + "\nCreditNumber = "
				+ CreditNumber + "\nLimitedUser=" + Limited;
	}
	

}
