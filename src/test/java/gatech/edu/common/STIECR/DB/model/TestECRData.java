/**
 * 
 */
package gatech.edu.common.STIECR.DB.model;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.gatech.chai.ecr.jpa.json.ECR;
import edu.gatech.chai.ecr.jpa.json.Patient;
import edu.gatech.chai.ecr.jpa.json.TypeableID;
import edu.gatech.chai.ecr.jpa.json.utils.ECRJsonConverter;
import edu.gatech.chai.ecr.jpa.model.ECRData;

/**
 * @author taylorde
 *
 */
public class TestECRData {

	/**
	 * Test method for {@link edu.gatech.chai.ecr.jpa.model.ECRData#ECRData()}.
	 */
	@Test
	public void testECRData() {
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.gatech.chai.ecr.jpa.model.ECRData#ECRData(edu.gatech.chai.ecr.jpa.json.ECR, int)}.
	 */
	@Test
	public void testECRDataECRInt() {
		ECR ecr = new ECR();
		Patient patient = new Patient();
		TypeableID mrnId = new TypeableID();
		mrnId.settype("MR");
		mrnId.setvalue("1111111");
		patient.getid().add(mrnId);
		ecr.setPatient(patient);
		
		ECRData ecrData = new ECRData(ecr,2222);
		
		ECRJsonConverter converter = new ECRJsonConverter();
		String ecrStr = converter.convertToDatabaseColumn(ecr);
		ECR convertedECR = converter.convertToEntityAttribute(ecrStr);
		
		assertEquals(1, convertedECR.getPatient().getid().size());
	}

	/**
	 * Test method for {@link edu.gatech.chai.ecr.jpa.model.ECRData#getECR()}.
	 */
	@Test
	public void testGetECR() {
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.gatech.chai.ecr.jpa.model.ECRData#setECR(edu.gatech.chai.ecr.jpa.json.ECR)}.
	 */
	@Test
	public void testSetECR() {
//		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.gatech.chai.ecr.jpa.model.ECRData#update(edu.gatech.chai.ecr.jpa.json.ECR)}.
	 */
	@Test
	public void testUpdate() {
//		fail("Not yet implemented");
	}
}
