package scorewebservice;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlAccessType;

/**
 * The @XmlType annotation is used as the data encapsulated by the Score class is
 * sent to the SOAP web services in XML Format.
 * The @XmlAccessorType annotation indicates field-based access as we do not have any getter and setter
 * methods.
 * The Score class stores number of wins and losses.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Score {
	public int wins, losses;
}
