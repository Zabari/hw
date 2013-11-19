// DANIEL ZABARI
// pd 9
// HW27
// 2013-11-18
public class Rational{
   public int _numer;
   public int _denomer;

    public Rational(){
	_numer=0;
	_denomer=1;
    }
    public Rational(int num, int den){
	if (!(den==0)){
	    _numer=num;
	    _denomer=den;
	} else {
	    _numer=0;
	    _denomer=1;
	}
    }
    public String toString(){
	return "Your number eez "+_numer+"/"+_denomer+" .";
    }
    public float floatValue(){
	return (float) _numer/_denomer;
    }
    public void multiply(Rational num){
	this._numer*=num._numer;
	this._denomer*=num._denomer;
    }
    public void divide(Rational num){
	this._numer/=num._numer;
	this._denomer/=num._denomer;
    }

    public static void main(String[] args){
	Rational numy=new Rational(4,6);
	Rational num2=new Rational(2,2);
	System.out.println(numy);
	System.out.println(numy.floatValue());
	numy.multiply(num2);
	System.out.println(numy);
	numy.divide(num2);
	System.out.println(numy);
	

    }



}


