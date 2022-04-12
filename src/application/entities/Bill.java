package application.entities;

public class Bill {
	static final double BEER_PRICE = 5.0;
	static final double SOFT_DRINK_PRICE = 3.0;
	static final double BARBECUE_PRICE = 7.0;
	static final double MAN_TICKET = 10.0;
	static final double WORMAN_TICKET = 8.0;
	static final double FEEDING_MIN = 30.0;
	static final double COVER_PRICE = 4.0;

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		if (feeding() <= FEEDING_MIN)
			return COVER_PRICE;
		else
			return 0.0;
	}

	public double feeding() {
		return this.beer * BEER_PRICE + this.barbecue * BARBECUE_PRICE + this.softDrink * SOFT_DRINK_PRICE;
	}

	public double ticket() {
		if (this.gender == 'F')
			return WORMAN_TICKET;
		else
			return MAN_TICKET;
	}

	public double total() {
		return cover() + feeding() + ticket();
	}
}
