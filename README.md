# APPL_SOLID_Exercises
Latihan prinsip SOLID dalam pemrograman OOP

Solusi latihan tersedia dalam bahasa Java. Latihan dimaksudkan untuk menguatkan prinsip SOLID pada saat melakukan pemrograman. Berikut adalah Prinsip SOLID yang diterapkan sesuai dengan instruksi pada laman https://github.com/stefkavasileva/SoftUni-Software-Engineering/tree/master/C%23Fundamentals/OOP-Advanced/Exercises/SOLID-Lab.

#### 1. StreamProgress -- Prinsip yang dipakai: OCP & LSP

Pada project ke-1 instruksi yang harus diselesaikan adalah agar kelas **StreamProgressInfo** dapat mengolah banyak tipe stream dan memungkinkan untuk menambahkan tipe stream baru. Prinsip yang dipakai adalah **OCP** di mana suatu kelas harus terbuka terhadap ekstensi tetapi tertutup untuk modifikasi. Pada kasus ini, **OCP** diraih dengan membuat interface yaitu **IStreamable** yang berisi skeleton method getter dan setter untuk length dan bytesSent.

Selanjutnya adalah dengan membuat kelas stream (File dan Music) agar mengimplementasikan **IStreamable**. Lalu, kelas **StreamProgressInfo** cukup dengan menyimpan atribut base class nya saja (dalam hal ini IStreamable) sehingga konstruktor *StreamProgressInfo* bisa dipenuhi dengan passing derived class apa saja. Di sini lah prinsip **LSP** berlaku. 

#### 2. GraphicEditor -- Prinsip yang dipakai: OCP

3. DetailPrinter -- Prinsip yang dipakai: OCP
4. Recharge -- Prinsip yang dipakai: ISP
5. SecurityDoor -- Prinsip yang dipakai: ISP & DIP
