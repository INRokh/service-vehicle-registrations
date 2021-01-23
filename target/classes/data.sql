INSERT INTO insurer (id, name, code) VALUES(1, 'GIO', 13);
INSERT INTO insurer (id, name, code) VALUES(2, 'AAMI', 17);
INSERT INTO insurer (id, name, code) VALUES(3, 'NRMA', 27);
INSERT INTO insurer (id, name, code) VALUES(4, 'Allianz', 32);

INSERT INTO vehicle (id, type, make, model, colour, vin, tare_weight)
  VALUES(1, 'Wagon', 'BMW', 'X4 M40i', 'Blue', '12389347324', 1700);
INSERT INTO vehicle (id, type, make, model, colour, vin, tare_weight, gross_mass)
  VALUES(2, 'Hatch', 'Toyota', 'Corolla', 'Silver', '54646546313', 1432, 1500);
INSERT INTO vehicle (id, type, make, model, colour, vin, tare_weight)
  VALUES(3, 'Sedan', 'Mercedes', 'X4 M40i', 'Blue', '87676676762', 1700);
INSERT INTO vehicle (id, type, make, model, colour, vin, tare_weight)
  VALUES(4, 'SUV', 'Jaguar', 'F pace', 'Green', '65465466541', 1620);

INSERT INTO vehicle_registration (id, plate_number, expired, expiry_date, insurer_id, vehicle_id)
  VALUES(1, 'EBF28E', FALSE, '2021-02-05T23:15:30.000Z', 4, 1);
INSERT INTO vehicle_registration (id, plate_number, expired, expiry_date, insurer_id, vehicle_id)
  VALUES(2, 'CXD82F', TRUE, '2020-03-01T23:15:30.000Z', 2, 2);
INSERT INTO vehicle_registration (id, plate_number, expired, expiry_date, insurer_id, vehicle_id)
  VALUES(3, 'WOP29P', FALSE, '2020-12-08T23:15:30.000Z', 1, 3);
INSERT INTO vehicle_registration (id, plate_number, expired, expiry_date, insurer_id, vehicle_id)
  VALUES(4, 'QWX55Z', FALSE, '2021-07-20T23:15:30.000Z', 3, 4);