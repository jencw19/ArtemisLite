/**
 * 
 */
package artemis;

/**
 * @author christopherireland
 *
 */
public class Element extends Square {

	private SystemNames systemName;

	/**
	 * 
	 */
	public Element() {

	}

	/**
	 * @param squareName
	 * @param ownerName
	 * @param owned
	 */
	public Element(String squareName, String ownerName, boolean owned, SystemNames systemNames) {
		super(squareName, ownerName, owned);
		this.systemName = systemNames;

	}

	/**
	 * @return the systemName
	 */
	public SystemNames getSystemName() {
		return systemName;
	}

	/**
	 * @param systemName the systemName to set
	 */
	public void setSystemName(SystemNames systemName) {
		this.systemName = systemName;
	}

	public static void payRent(Boolean owned) {
		if (owned == true) {
			System.out.println("Rent is due");
		} else {
			System.out.println("purchase square?");
		}
	}

	@Override
	public void knowsSquare(String squareName, Boolean owned, String owner) {
		
	}
}
