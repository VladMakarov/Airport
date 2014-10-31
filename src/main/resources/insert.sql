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
		('Vladyslav', 'Makarov', 'Aleksandrovich', '+38093...');

INSERT INTO FlightType
		(numberOfClass, price)
	VALUES
		('First Class', 300),
		('Second Class', 200),
		('Third Class', 0);
		
INSERT INTO Flight
		(flightTypeId, date, airportIdDeparture, airportIdArrival, price, category)
	VALUES
		(1, '1998/05/31:12:00:00AM', 1, 6, 1100, 'Luxury'),
		(1, '1998/05/31:12:00:00AM', 1, 7, 1200, 'Luxury'),
		(2, '1998/05/31:12:00:00AM', 1, 2, 600, 'Mid Luxury'),
		(2, '1998/05/31:12:00:00AM', 1, 4, 800, 'Mid Luxury'),
		(3, '1998/05/31:12:00:00AM', 1, 3, 700, 'Budget'),
		(3, '1998/05/31:12:00:00AM', 1, 5, 900, 'Budget');
		

