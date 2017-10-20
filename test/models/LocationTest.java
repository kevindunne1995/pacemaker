package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest
{

	 @Test
	  public void testCreate()
	  {
	    Location one = new Location(23.3f, 33.3f);
	    assertEquals ( 23.3f, one.latitude,0.01);
	    assertEquals ( 33.3f, one.longitude,0.01);
	  }
	 
	 @Test
	  public void testIds()
	  {
	    Location one = new Location(23.3f, 33.3f);
	    Location two = new Location(34.4f, 22.2f);
	    assertNotEquals(one.id, two.id);

	  }

	  @Test
	  public void testToString()
	  {
	    Location one = new Location(23.3f, 33.3f);
	    assertEquals ("Location{2, 23.3, 33.3}", one.toString());
	  }
}