/**
 * 
 */
package ram.dctm.data;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import com.emc.documentum.springdata.entitymanager.mapping.DctmAttribute;
import com.emc.documentum.springdata.entitymanager.mapping.DctmEntity;

/**
 * @author ramesh.kandula
 *
 */
@DctmEntity(repository="ebprid")
@Entity(name="um_correspondency")
public class Correspondency {

	@Id
	protected String id;
	
	@DctmAttribute(value="object_name")
	private String docName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}
	
	
	
}
