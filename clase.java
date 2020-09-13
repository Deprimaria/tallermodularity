import java.util.GregorianCalendar;

public class DateBeauty {
	private int d; // 1 <= day <= days in month
	private int m; // 1 <= month <= 12
	private int y;

	public Date_Beast(int y, int m, int d) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public void setToNextDay() {
		GregorianCalendar c = new GregorianCalendar();
		c.set(Calendar.YEAR,y);
    	c.set(Calendar.MONTH,m-1);
    	int dt = c.getActualMaximum(Calendar.DATE);
		int dtm = -1;
		if(dt == 31) {
			dtm = 31
		} else if (dt == 30) {
			dtm = 30;
		} else if(c.isLeapYear(y)) {
			dtm = 29;
	    } else {
	    	dtm = 28;
	    }

		d += 1;
		if(d > dtm){
			d = 1;
			m += 1;
		}
		if(m <= 11)
			return;
		m = 0;
		y += 1;
	}
}
