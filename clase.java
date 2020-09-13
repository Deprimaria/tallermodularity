public class Date_Beast {
	private int d; // 1 <= day <= days in month
	private int m; // 1 <= month <= 12
	private int y;

	public Date_Beast(int y, int m, int d) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public void setToNextDay() {
		int dtm = m == 1 || m == 3 || m == 5 || 
			m == 7 || m == 8 || m == 10 || m == 12 ? 31 
			: m == 4 || m == 6 || m == 9 || m == 11 ? 30 
			: (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ? 29 : 28;

		d += 1;
		if(d > dtm){
			d = 1;
			m += 1;
		}
		if(m <= 12)
			return;
		m = 1;
		y += 1;
	}
}
