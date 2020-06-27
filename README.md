# APPL_SOLID_Exercises
Latihan prinsip SOLID dalam pemrograman OOP

Solusi latihan tersedia dalam bahasa Java. Latihan dimaksudkan untuk menguatkan prinsip SOLID pada saat melakukan pemrograman. Berikut adalah Prinsip SOLID yang diterapkan sesuai dengan instruksi pada laman https://github.com/stefkavasileva/SoftUni-Software-Engineering/tree/master/C%23Fundamentals/OOP-Advanced/Exercises/SOLID-Lab.

#### 1. StreamProgress -- Prinsip yang dipakai: OCP & LSP

Pada project ke-1, instruksi yang harus diselesaikan adalah agar kelas **StreamProgressInfo** dapat mengolah banyak tipe stream dan memungkinkan untuk menambahkan tipe stream baru. Prinsip yang dipakai adalah **OCP** di mana suatu kelas harus terbuka terhadap ekstensi tetapi tertutup untuk modifikasi. Pada kasus ini, **OCP** diraih dengan membuat interface yaitu **IStreamable** yang berisi skeleton method getter dan setter untuk length dan bytesSent.

Selanjutnya adalah dengan membuat kelas stream (File dan Music) agar mengimplementasikan **IStreamable**. Lalu, kelas **StreamProgressInfo** cukup dengan menyimpan atribut base class nya saja (dalam hal ini IStreamable) sehingga konstruktor *StreamProgressInfo* bisa dipenuhi dengan passing derived class apa saja. Di sini lah prinsip **LSP** berlaku. 

#### 2. GraphicEditor -- Prinsip yang dipakai: OCP & LSP

Pada project ke-2, instruksi yang harus diselesaikan adalah agar kelas **GraphicEditor** bisa menggambar semua tipe bentuk (shape) tanpa melakukan pengecekan menggunakan if-else block. Juga agar **GraphicEditor** bisa tidak usah diubah ketika ada tipe shape baru. Hal ini dapat diatasi dengan prinsip **OCP** sebagaimana tertera pada sumber bacaan. **OCP** pada kasus ini diraih dengan membuat kelas jenis shape (Circle, Rectangle, dan Square) mengimplementasikan interface yaitu **IShape**. Kemudian kelas **GraphicEditor** cukup berleasi dengan interface saja dengan membuat method yang menerima tipe base-nya yaitu IShape. Dengan demikian setiap jenis shape dapat digambar dengan method yang sama oleh **GraphicEditor** tanpa mengubah lagi ketika ada kelas bentuk baru. Hal ini menunjukan juga bahwa LSP berlaku pada saat passing objek derived class terhadap parameter base class.  
#### 3. DetailPrinter -- Prinsip yang dipakai: OCP

Pada project ke-3, instruksi yang harus diselesaikan tidak jauh dengan yang sebelumnya yaitu menggunakan **OCP** agar kelas DetailPrinter tidak perlu lagu melakukan pemeriksaan tipe konkrit dari kelas Employee yang datang serta agar kelas **DetailPrinter** pun dapat menerima bila ada tipe Employee baru. Tidak berbeda jauh dengan nomor sebelumnya, yaitu dengan membuat **Employee** menjadi *superclass*  yang cukup menyimpan atribut berupa List of Employee. Dengan menjadikan **Employee** superclass, maka Polymorphism pada kelas pun akan berlaku, sehingga kelas **DetailPrinter** cukup untuk melakukan looping pada setiap employee yang ada pada list tanpa perlu tahu bagaimana isi method pada derived class.

#### 4. Recharge -- Prinsip yang dipakai: OCP & ISP

Pada kasus ke-4, prinsip yang digunakan adalah **ISP** yaitu memisahkan interface ke bagian yang lebih kecil dan spesifik. Pada petunjuk disebutkan agar kelas Robot mengimplemetasikan interface IRechargeable dan extends terhadap kelas Worker di saat yang bersamaan. Penerapan prinsip **ISP** ialah pada pemisahan antara **ISleeper** dan **IRechargeable** untuk masing-masing kelas konkritnya ialah **Employee** dan **Robot** (yang keduanya Worker). Selain **ISP**, **OCP** pun diterapkan pada **RechargeStation** yang mengambil parameter untuk method recharge() berupa **IRechargeable** (base) sehingga memungkinkan penambahan tipe Rechargeable yang baru tanpa merubah logic dari RechargeStation.  

#### 5. SecurityDoor -- Prinsip yang dipakai: OCP, ISP & DIP

Pada kasus ke-5, prinsip yang digunakan adalah **ISP** (menggunakan lebih banyak spesifik interface) dan **DIP** (bergantung pada sesuatu yang abstrak). **ISP** pada kasus ke-5 diraih dengan memecah interface **ISecurityUI** menjadi dua interface yang berbeda dan melakukan inheritance terhadap **ISecurityUI**. **ISecurity** dipecah menjadi **IRequestKeyCard** dan **IRequestPinCode** untuk masing masing kelas yang inherit ke **SecuriyCheck** (KeyCardCheck dan PinCodeCheck).

Sementara itu, prinsip OCP diterapkan pada kelas ScannerUI yang implements terhadap **ISecurityUI**. Dengan demikian ketika ada metode pengecekan baru (selain key dan PIN), Scanner hanya tinggal menambahkan method ybs. saja dengan overriding pada class **ScannerUI** tanpa harus menambahkan implements ke interface IRequest.. yang baru. Prinsip **DIP** dipakai pada inheritance terhadap suatu abstract class yakni kelas **SecurityCheck**.

#### Catatan
Sumber Bacaan: Design Principles and Design Pattern, Robert C. Martin (handout week 15)
