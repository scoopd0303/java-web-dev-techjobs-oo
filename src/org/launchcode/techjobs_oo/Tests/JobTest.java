package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job emptyTestOne;
    Job emptyTestTwo;
    Job testJob;
    @Before
    public void createJobObject() {
        emptyTestOne = new Job();
        emptyTestTwo = new Job();
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(emptyTestOne.equals(emptyTestTwo));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob.equals(testJobTwo));
    }

    @Test
    public void jobToStringMethodReturnsTrue() {
        assertEquals("ID: "+ testJob.getId() + "\n" +
                        "Name: Product tester\n" +
                        "Employer: ACME\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality control\n" +
                        "Core Competency: Persistence\n", testJob.toString()
        );
    }

    @Test
    public void jobWithEmptyStringFieldReturnsWithCorrectMessage() {
        Job jobWithEmptyField = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("ID: " + jobWithEmptyField.getId() + "\n" +
                        "Name: Product tester\n" +
                        "Employer: Data not available\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality control\n" +
                        "Core Competency: Persistence\n", jobWithEmptyField.toString()
        );
    }


    @Test
    public void jobWithOnlyIdReturnsOopsMessage() {
        assertEquals("OOPS! This job does not seem to exist.", emptyTestOne.toString() );
    }

}
