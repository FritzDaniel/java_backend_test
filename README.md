## BACKEND TEST

GET
getBooks
http://localhost:8080/api/books 
untuk melihat list semua buku

GET
getBookById
http://localhost:8080/api/books/1
untuk mendapatkan data buku dengan uniq id

GET
getBooksByStatus
http://localhost:8080/api/books/status/0
mendapatkan list buku dengan status

POST
createBooks
http://localhost:8080/api/books
Bodyraw (json)
json
{
  "title": "Harry Potter dan Batu Bertuah",
  "author": "J.K Rowling",
  "publisher": "Gramedia",
  "releaseDate": "1997-06-29",
  "pageCount": 384
}
json untuk membuat data buku

PUT
updateBooks
http://localhost:8080/api/books/1
Bodyraw (json)
json
{
  "title": "harry potter and the sorcerer's stone",
  "author": "J.K Rowling",
  "publisher": "Gramedia",
  "releaseDate": "1997-06-29",
  "pageCount": 400
}
json untuk mengedit data buku

PUT
borrowBook
http://localhost:8080/api/books/borrow/1
Bodyraw (json)
json
{
  "status": 1,
  "borrower": "Fritz",
  "borrowDate": "2023-07-23",
  "returnDate": "2023-07-24"
}
json untuk meminjam buku

DEL
DeleteBooks
http://localhost:8080/api/books/1
api untuk mendelete data buku dengan uniq id
