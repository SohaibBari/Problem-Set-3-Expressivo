/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    /**
     * @return a parsable representation of this expression, such that
     * for all e:Expression, e.equals(Expression.parse(e.toString())).
     */
    @Test
    public void testTreeEmpty() {
    	Expression V1= new Variable("");
    	
    	
    	String x= "";
        assertEquals("empty expression", "", V1.toString());
    	
    }
    @Test
    public void testTree() {
    	Expression V1= new Variable("x");
    	Expression V2= new Variable("y");
    	Expression V3= new Variable("z");
    	Expression M1= new Multiplication(V2,V3);
    	Expression A1 = new Addition(V1,M1);
    	
    	
    	
    	String x= "x+y*z";
        assertEquals("empty expression", "x+y*z", A1.toString());
    	
    }
    
    /**
     * @param thatObject any object
     * @return true if and only if this and thatObject are structurally-equal
     * Expressions, as defined in the PS3 handout.
     */

    

    /**
     * @return hash code value consistent with the equals() definition of structural
     * equality, such that for all e1,e2:Expression,
     *     e1.equals(e2) implies e1.hashCode() == e2.hashCode()
     */
    @Test 
    public void testVariablesAlone() {
		Variable v = new Variable("oo");
		assertEquals("Variable's string representation should be correct", 
				"oo", v.toString());
	}
    
    @Test 
    public void testVariablesEquals() {
    	Variable variable= new Variable("foo");
    	assertTrue("Variables with the same id should be equal to each other", 
				variable.equals(variable));
    	
    }
    @Test
    public void testTwoExpressionsMultiplicationEquals() {
    	Expression V1= new Variable("x");
    	Expression V2= new Variable("y");
    	Expression V3= new Variable("z");
    	Expression M1= new Multiplication(V2,V3);
    	
    	Expression V12= new Variable("x");
    	Expression V22= new Variable("y");
    	Expression V32= new Variable("z");
    	Expression M12= new Multiplication(V2,V3);
    	
    	assertTrue("Same Expressions must be equal for Multiplication", 
				M1.equals(M12));
    }
    
    @Test
    public void testTwoExpressionsReflexiveInequals() {
    	Expression V2= new Variable("y");
    	Expression V3= new Variable("z");
    	Expression M1= new Multiplication(V2,V3);
    	
    	Expression V22= new Variable("y");
    	Expression V32= new Variable("z");
    	Expression M12= new Multiplication(V3,V2);
    	
    	assertFalse("Same Expressions must be equal for Multiplication", 
				M1.equals(M12));
    }
    
    @Test
    public void testTwoExpressionsEquals() {
    	Expression V1= new Variable("x");
    	Expression V2= new Variable("y");
    	Expression V3= new Variable("z");
    	Expression M1= new Multiplication(V2,V3);
    	Expression A1 = new Addition(V1,M1);
    	
    	Expression V12= new Variable("x");
    	Expression V22= new Variable("y");
    	Expression V32= new Variable("z");
    	Expression M12= new Multiplication(V2,V3);
    	Expression A12 = new Addition(V1,M1);
    	
    	assertTrue("Same Expressions must be equal", 
				A1.equals(A12));
    }
    
    @Test
    public void testTwoVariablesHash() {
    	Variable variable1= new Variable("foo");
    	Variable variable2= new Variable("foo");
    	assertEquals("Variables with the same id should have same hash value", 
				variable1.hashCode(), variable2.hashCode());
    }
    
    @Test
    public void testTwoExpressionsHash() {
    	Expression V1= new Variable("x");
    	Expression V2= new Variable("y");
    	Expression V3= new Variable("z");
    	Expression M1= new Multiplication(V2,V3);
    	Expression A1 = new Addition(V1,M1);
    	
    	Expression V12= new Variable("x");
    	Expression V22= new Variable("y");
    	Expression V32= new Variable("z");
    	Expression M12= new Multiplication(V2,V3);
    	Expression A12 = new Addition(V1,M1);
    	
    	assertEquals("Variables with the same id should have same hash value", 
				A1.hashCode(), A12.hashCode());
    	
    	
    }
    
    
    
}
