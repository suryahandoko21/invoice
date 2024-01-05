INSERT INTO invoice.customer (id,customer_name,customer_address,customer_description,created_by,updated_by,created_at,updated_at) VALUES
	 (1,'PT Siloam','Tangerang','rumah sakit','system','system','2024-01-03 14:03:30','2024-01-03 09:57:42'),
	 (2,'PT INDOSURYA','Tangerang','Garmen','system','system','2024-01-04 21:17:13','2024-01-04 21:17:13');


INSERT INTO invoice.item (id,item_name,item_type,created_by,updated_by,created_at,updated_at,item_description,item_code) VALUES
	 (1,'Meeting','Service',"admin","admin",'2024-01-03 10:53:11','2024-01-03 14:20:54','Design','IT-001'),
	 (2,'Development','Service',"admin",'admin','2024-01-04 14:40:21','2024-01-04 21:40:22','Design','IT-002'),
	 (3,'Printer','Hardware',"admin","admin",'2024-01-04 21:32:53','2024-01-04 21:32:53','Development','IT-003'),
	 (4,'Monitor','Hardware',"admin","admin",'2024-01-04 21:33:15','2024-01-04 21:33:15','Development','IT-004');
