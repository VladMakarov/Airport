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
		
INSERT INTO FlightSpecific
		(flightTypeId, date, airportIdDeparture, airportIdArrival, price)
	VALUES
		(1, '1998/05/31:12:00:00AM', 1, 6, 1100),
		(1, '1998/05/31:12:00:00AM', 1, 7, 1200),
		(2, '1998/05/31:12:00:00AM', 1, 2, 600),
		(2, '1998/05/31:12:00:00AM', 1, 4, 800),
		(3, '1998/05/31:12:00:00AM', 1, 3, 700),
		(3, '1998/05/31:12:00:00AM', 1, 5, 900);

