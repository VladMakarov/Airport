INSERT INTO Airport 
		(name, adress)
	VALUES
		('Boryspol', 'Kyev'),
		('KhAirport', 'Kharkov'),
		('DonAirport', 'Donetsk'),
		('OdsAirport', 'Odessa'),
		('SimfAirport', 'Simferopol'),
		('AntAirport', 'Antalya'),
		('HurgAirport', 'Hurghada');

INSERT INTO Passenger
		(fname, lname, patronymic, phoneNumber)
	VALUES
		('Vladyslav', 'Makarov', 'Aleksandrovich', '+380939537896');

INSERT INTO FlightType
		(numberOfClass, price)
	VALUES
		('First Class', 300),
		('Second Class', 200),
		('Third Class', 0);
		
INSERT INTO Flight
		(flightTypeId, date, airportIdDeparture, airportIdArrival, price, category)
	VALUES
		(1, '02.11.2014 - 14:20', 1, 6, 1100, 'Luxury'),
		(1, '03.11.2014 - 21:34', 1, 7, 1200, 'Luxury'),
		(2, '05.11.2014 - 02:52', 1, 2, 600, 'Mid Luxury'),
		(2, '10.11.2014 - 12:45', 1, 4, 800, 'Mid Luxury'),
		(3, '13.11.2014 - 13:53', 1, 3, 700, 'Budget'),
		(3, '22.11.2014 - 00:10', 1, 5, 900, 'Budget');
		

