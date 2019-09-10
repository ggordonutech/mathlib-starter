
public class RecursiveMathLib
extends MathLib
{

	@Override
	public int gcd(int x, int y) {
        if(y==0) {
        	return x;
        }
        if( x>= y && x != 0) {
        	return gcd(y,x%y);
        }
		return 0;
	}

}
