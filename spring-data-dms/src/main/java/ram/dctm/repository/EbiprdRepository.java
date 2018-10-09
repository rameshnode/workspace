/**
 * 
 */
package ram.dctm.repository;

/**
 * @author ramesh.kandula
 *
 */


import com.emc.documentum.springdata.repository.DctmRepositoryWithContent;

import ram.dctm.data.Correspondency;

/**
 * Basic Contact Spring Data Repository used for interacting with contact repository objects
 *
 * @author Simon O'Brien
 */

public interface EbiprdRepository extends DctmRepositoryWithContent<Correspondency, String> {

    public Iterable<Correspondency> findAll();


    public Iterable<Correspondency> findByNameContaining(String value);
    
    
    /*@Override
    default Correspondency findOne(String id) {
    	// TODO Auto-generated method stub
    	return null;
    }*/
}