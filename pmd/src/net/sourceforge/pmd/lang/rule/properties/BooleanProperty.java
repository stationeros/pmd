/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.rule.properties;

/**
 * Defines a property type that supports single Boolean values.
 * 
 * @author Brian Remedios
 */
public class BooleanProperty extends AbstractScalarProperty<Boolean> {

	/**
	 * Constructor for BooleanProperty limited to a single value.
	 * 
	 * @param theName String
	 * @param theDescription String
	 * @param defaultValue boolean
	 * @param theUIOrder float
	 */
	public BooleanProperty(String theName, String theDescription, Boolean defaultValue, float theUIOrder) {
		super(theName, theDescription, Boolean.valueOf(defaultValue), theUIOrder);
	}
	
    /**
     * Constructor for BooleanProperty limited to a single value.
     * Converts default argument string into a boolean.
     * 
     * @param theName String
     * @param theDescription String
     * @param defaultStr String
     * @param theUIOrder float
     */
    public BooleanProperty(String theName, String theDescription, String defaultStr, float theUIOrder) {
        this(theName, theDescription, boolFrom(defaultStr), theUIOrder);
    }

    private static Boolean boolFrom(String boolStr) {
        return Boolean.valueOf(boolStr);
    }
    
	/**
	 * @return Class
	 * @see net.sourceforge.pmd.PropertyDescriptor#type()
	 */
	public Class<Boolean> type() {
		return Boolean.class;
	}

	/**
	 * Creates and returns a Boolean instance from a raw string
	 * 
	 * @param value String
	 * @return Object
	 */
	protected Object createFrom(String value) {
		return boolFrom(value);
	}
}
