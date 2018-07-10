package sample.src;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestGolfer {
	
 @Test

    public void TestGettersandSetters() {
	Golfer golfer = new Golfer ("joe","malachowski",99);

/* 	String name = golfer.getFirstname(); */
/* 	String surname = golfer.getLastname(); */
 	Double scratch = golfer.getHandicap();
 	
 	Assert.assertEquals(100.0,scratch);
 }
}
