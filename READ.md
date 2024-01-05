- APLIKASI Invoice -

menggunakan java spring dan mysql 5.7

requirement
- JDK 17 
- Docker (optional)

- config app di src/main/resource/application.properties

jika menggunakan docker  
- masuk ke root directory dan jalankan docker-compose up -d
    - akan membuat image docker mysql 5.7 dengan username=admin dan password =admin port=3309
- konek ke db dengan menggunakan tool seperti dbever atau yang lain 
- jalankan file sql yang ada di folder db
    - file invoice.sql untuk membuat table
    - file data_seed.sql untuk membuat dummy isi table

jika tidak menggunakan docker
- buat database invoice di mysql
- ubah file config "sesuaikan dengan yang yang terinstall di PC"
- jalankan file sql yang ada di folder db
    - file invoice.sql untuk membuat table
    - file data_seed.sql untuk membuat dummy isi table

run application :
    run live  : mvn spring-boot:run (default port 7071)
    run build : 
                - mvn clean install
                - java -jar target/invoice-0.0.1-SNAPSHOT.jar --server.port=7071

postman 
https://api.postman.com/collections/4131954-c63015e3-3b41-4a98-a61d-713252b706b9?access_key=PMAT-01HKBFEQ8YYHC7SWFPXYG6DKP2        