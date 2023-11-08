# Restaurant APP

Family Restaurant merupakan restoran yang menyediakan berbagai macam hidangan yang 
terdiri dari dua menu yaitu menu Reguler dan menu Special. Anda sebagai programmer diminta untuk 
membuatkan program yang digunakan untuk mengatur daftar menu Family Restaurant dengan 
menggunakan konsep OOP (menggunakan Inheritance) dan disimpan dengan menggunakan Vector / 
ArrayList. 

## Functionality
Pada saat program pertama kali dijalankan akan menampilkan 6 buah pilihan yaitu Add 
Regular Menu, Add Special Menu, Show All Menu, Delete Regular Menu, Delete Special Menu dan Exit. 
Validasikan user hanya dapat memasukkan pilihan antara 1-6 dan berupa angka. Jika input tidak sesuai 
maka program akan meminta user untuk memasukkan pilihan lagi.

### Add Regular Menu

Ketika user memasukkan pilihan “1” maka program akan meminta user untuk memasukkan data 
untuk menu reguler yaitu:
- Kode Menu
Validasikan panjang kode menu 4 karakter dan huruf depannya “R”.
Kode Menu tidak boleh sama.
- Nama Menu
Validasikan panjang nama menu antara 5 sampai 20 karakter.
Nama Menu boleh sama.
- Harga
Validasikan harga menu antara 10000 – 100000 dan harus berupa angka.
Ketika user selesai memasukkan data untuk menu reguler maka program akan menampilkan pesan 
“Add Success"

### Add Special Menu

Ketika user memasukkan pilihan “2” maka program akan meminta user untuk memasukkan data 
untuk menu special yaitu:
- Kode Menu
Validasikan panjang kode menu 4 karakter dan huruf depannya “S”.
Kode Menu tidak boleh sama.
- Nama Menu
Validasikan panjang nama menu antara 5 sampai 20 karakter.
Nama Menu boleh sama.
- Harga
Validasikan harga menu antara 10.000 – 100.000 dan harus berupa angka.
- Diskon
Validasikan diskon hanya 10, 25 dan 50 persen.
Ketika user selesai memasukkan data untuk menu reguler maka program akan menampilkan pesan 
“Add Success"

### Show All Menu

Ketika user memasukkan pilihan “3” maka program akan menampilkan semua data menu reguler 
dan menu special

### Delete Regular Menu

Ketika user memasukkan pilihan “4” maka program akan meminta user untuk memasukkan kode 
menu reguler yang ingin dihapus. Validasikan panjang kode menu 4 karakter dan huruf depannya 
“R”. jika kode menu reguler yang dimasukkan ada, maka menu tersebut akan terhapus dan 
program akan menampilkan pesan “Delete Success”. Jika kode menu reguler yang dimasukkan 
tidak ada, maka program akan menampilkan pesan “Code is Wrong”.

### Delete Special Menu

Ketika user memasukkan pilihan “5” maka program akan meminta user untuk memasukkan kode 
menu special yang ingin dihapus. Validasikan panjang kode menu 4 karakter dan huruf depannya 
“S”. jika kode menu special yang dimasukkan ada, maka menu tersebut akan terhapus dan 
program akan menampilkan pesan “Delete Success”. Jika kode menu special yang dimasukkan 
tidak ada, maka program akan menampilkan pesan “Code is Wrong”.

### Exit

Exit program

## Class Diagram
![alt text](./static/Restaurant%20V%200.0.1.png)


while(statement){
    code execution
}

selama stament itu bener maka jalankan kode dibawah

while(!(T)){
    kode ga akan jalan 
}

while(!(F)){
    kode akan jalan
}