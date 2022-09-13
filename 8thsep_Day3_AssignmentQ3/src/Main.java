
public class Main {

	public static void main(String[] args) {
	Date d1=new Date(31,12,96);
	Date d2=new Date(13,1,34);
	Date d3=new Date(5,21,96);
	Date d4=new Date(33,12,96);
	d1.displayDate(d1.dd,d1.mm,d1.yy);
	d1.checkDate(d1.dd,d1.mm,d1.yy);
	d2.displayDate(d2.dd,d2.mm,d2.yy);
	d2.checkDate(d2.dd,d2.mm,d2.yy);
	d3.displayDate(d3.dd,d3.mm,d3.yy);
	d3.checkDate(d3.dd,d3.mm,d3.yy);
	d4.displayDate(d4.dd,d4.mm,d4.yy);
	d4.checkDate(d4.dd,d4.mm,d4.yy);
	}

}
