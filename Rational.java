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
	this._numer*=num._denomer;
	this._denomer*=num._numer;
    }
    public void add(Rational num){
	this._numer=this._numer*num._denomer+num._numer*this._denomer;
	this._denomer*=num._denomer;
    }
    public void subtract(Rational num){
	this._numer=this._numer*num._denomer-num._numer*this._denomer;
	this._denomer*=num._denomer;
    }
    public static int gcdew(int a, int b){
	int x=a;
	a=Math.max(a,b);
	b=Math.min(x,b);
	while (b>0){
	    x=a-b;
	    a=Math.max(x,b);
	    b=Math.min(x,b);
	}
	return a;
    }
    public int gcd(){
	return gcdew(this._numer,this._denomer);
    }
    public void reduce(){
	int x=gcd();
	this._numer/=x;
	this._denomer/=x;
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
	numy.add(num2);
	System.out.println(numy);
	numy.subtract(num2);
	System.out.println(numy);
	System.out.println(numy.gcd());
	numy.reduce();
	System.out.println(numy);
	

    }



}


