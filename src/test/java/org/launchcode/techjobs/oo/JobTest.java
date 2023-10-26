package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job.getName() instanceof String);
        assertEquals("Product tester", test_job.getName());

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().toString());

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().toString());

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().toString());

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();

        assertEquals(test_job.toString().startsWith(newLine), test_job.toString().endsWith(newLine));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String expected = newLine +
                "ID: 4" + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Desert" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine;

        assertEquals(expected, test_job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String expected = newLine +
                "ID: 3" + newLine +
                "Name: Product tester" + newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control" + newLine +
                "Core Competency: Persistence" + newLine;

        assertEquals(expected, test_job.toString());
    }



}
