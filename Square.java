/**
 * 
 */
package artemis;

/**
 * @author christopherireland
 *
 */
public abstract class Square {

	private String squareName, ownerName;
	private boolean owned;

	/**
	 * 
	 */
	public Square() {
		
	}
	
	/**
	 * 
	 * @param squareName
	 * @param ownerName
	 * @param owned
	 */
	public Square(String squareName, String ownerName, boolean owned) {
		this.squareName = squareName; 
		this.ownerName = ownerName; 
		this.owned = owned; 
	}
	
	/**
	 * @return the squareName
	 */
	public String getSquareName() {
		return squareName;
	}

	/**
	 * @param squareName the squareName to set
	 */
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the owned
	 */
	public boolean isOwned() {
		return owned;
	}

	/**
	 * @param owned the owned to set
	 */
	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	/**
	 * 
	 */
	public void displayAll() {
		System.out.println("Square name			 : " + getSquareName());
		System.out.println("Owner name 			 : " + getOwnerName());
		System.out.println("Is this square owned 		: " + isOwned());
	}
	
	/**
	 * 
	 * @param squareName
	 * @param owned
	 * @param ownerName
	 */
	public abstract void knowsSquare(String squareName, Boolean owned, String ownerName);

}
