package expressivo;

public class Value implements Expression {
	
	private final int val;
	
	public Value(int val) {
		this.val = val;
	}
	@Override 
	public String toString() {
		 return Integer.toString(val);
	}

	    /**
	     * @param thatObject any object
	     * @return true if and only if this and thatObject are structurally-equal
	     * Expressions, as defined in the PS3 handout.
	     */
	@Override
	public boolean equals(Object thatObject) {
		if (thatObject instanceof Value) {
			if (((Value) thatObject).toString().equals(this.toString())) {
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
		return val;
	}
}
