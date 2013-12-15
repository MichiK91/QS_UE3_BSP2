import java.security.InvalidParameterException;


public class QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle {
	
	public QSVU_UEbung3_1126331_Kirchknopf_Michael_Triangle(){
		
	}
	
	public double calcHypotenuse(double k1, double k2) throws InvalidParameterException {
		if (k1 == k2)
			throw new InvalidParameterException("Ungueltige Parameter");
		if (k1 <= 0 || k2 <= 0)
			throw new InvalidParameterException("Negativer Parameter");
		return Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
	}
	
	public double calcWinkel(double w)throws InvalidParameterException {
		if(w >= 90)
			throw new InvalidParameterException("Ungueltiger Parameter");
		if(w <= 0)
			throw new InvalidParameterException("Negativer Parameter");
		return 180-90-w;
	}
	
	public double calcFlaeche(double k1, double k2) throws InvalidParameterException {
		if (k1 == k2)
			throw new InvalidParameterException("Ungueltige Parameter");
		if (k1 <= 0 || k2 <= 0)
			throw new InvalidParameterException("Negativer Parameter");
		return (k1*k2)/2;
	}
	

}
