package afi;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringUtilTest{
	
	public StringUtilTest() {
		// TODO Auto-generated constructor stub
	}
    @Test
    public void secondDuplicatetest(){
       Map <String,Integer> expectedResult= SecondDuplicate.secondDuplicate("sdfghhsdds");
       
       Map <String,Integer> actualResult=new HashMap<String,Integer>();
       actualResult.put("s",3);
       
       System.out.println(expectedResult);
       System.out.println(actualResult);
       assertEquals("Second dupliate",expectedResult.get("s"),actualResult.get("s"));
       
    }
}