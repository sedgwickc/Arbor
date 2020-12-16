package arbordata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import arbordata.Soil;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="soil")
public class Soil {
	
	public Soil() {
		
	}
	
	public Soil(String pName, String pDesc, String pDrain) {
		this.name = pName;
		this.description = pDesc;
		this.drainage = pDrain;
	}
	
	/* member variables */
	private String name;
	private String description;
	private String drainage;
	
	public Boolean someMethod() {
		System.out.println("Hello from Soil");
		return true;
	}

	/* getters/setters */

	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public String getDrainage() {
		return drainage;
	}

	public void setDrainage(String drainage) {
		this.drainage = drainage;
	}
	
	
}
