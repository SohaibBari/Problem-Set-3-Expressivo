package expressivo;

public class Addition implements Expression{
	final Expression left;
	final Expression right;
	
	public Addition(Expression e1, Expression e2) {
		left=e1;
		right=e2;
	}
	
	@Override 
	public String toString() {
		 return left.toString()+ "+" +right.toString();
	}

	    /**
	     * @param thatObject any object
	     * @return true if and only if this and thatObject are structurally-equal
	     * Expressions, as defined in the PS3 handout.
	     */
	@Override
	public boolean equals(Object thatObject) {
		if (thatObject instanceof Addition) {
			if (((Addition) thatObject).toString().equals(this.toString())) {
				return true;
			}
		}
		return false;
	}
	    
	    /**
	     * @return hash code value consistent with the equals() definition of structural
	     * equality, such that for all e1,e2:Expression,
	     *     e1.equals(e2) implies e1.hashCode() == e2.hashCode()
	     */
	@Override
	public int hashCode() {
		return 13*left.hashCode()+ 13*right.hashCode();
	}
}
