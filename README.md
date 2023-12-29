Konsep yang diperlihatkan dalam contoh kode di atas dalam bahasa pemrograman Java adalah sebagai berikut:

Konstruktor (Constructors):
Konstruktor adalah metode khusus dalam sebuah kelas yang digunakan untuk menginisialisasi objek. Mereka memiliki nama yang sama dengan kelasnya dan digunakan untuk mengatur nilai awal dari atribut objek. Dalam contoh yang diberikan:

Konstruktor Default: Person() menginisialisasi objek Person dengan nilai default.
Konstruktor Parameter: Person(String name, int age) menginisialisasi objek Person dengan nilai tertentu untuk name dan age.
Overloading:
Overloading terjadi ketika terdapat beberapa metode dalam kelas yang sama namun memiliki parameter atau daftar argumen yang berbeda. Dalam contoh:

Kelas Calculator memiliki dua metode add yang melakukan penambahan, satu untuk dua bilangan bulat dan yang lainnya untuk tiga bilangan bulat, menunjukkan overloading metode berdasarkan jumlah parameter.
Overriding:
Overriding terjadi ketika sebuah subclass memberikan implementasi spesifik untuk sebuah metode yang sudah didefinisikan di superclassnya. Dalam contoh:

Kelas Animal memiliki metode makeSound(), yang di-override dalam subclass Dog untuk memberikan suara yang berbeda.
Call by Value dan Call by Reference:
Java menggunakan pemanggilan berdasarkan nilai (call by value) saat melewatkan argumen ke metode.

Pemanggilan berdasarkan Nilai: Untuk tipe data primitif, salinan nilai tersebut yang dipassing. Dalam contoh, memodifikasi variabel primitif int (x) dalam sebuah metode (modifyPrimitive) tidak memengaruhi variabel aslinya.

Pemanggilan berdasarkan Referensi (atau Call by Sharing): Untuk objek, referensi ke lokasi memori objeknya yang dipassing berdasarkan nilainya. Perubahan yang dilakukan pada properti objek melalui referensi ini dalam metode akan tercermin pada objek aslinya. Dalam contoh, modifikasi atribut objek MyClass (obj.value) dalam metode modifyObject terlihat di luar metode karena objeknya dipassing berdasarkan referensinya.

Konsep-konsep tersebut merupakan dasar dalam pemrograman Java. Konstruktor digunakan untuk inisialisasi objek, overloading menyediakan fleksibilitas metode, dan overriding memungkinkan polimorfisme dan penyesuaian metode dalam pewarisan. Selain itu, memahami pemanggilan berdasarkan nilai dan pemanggilan berdasarkan referensi penting saat bekerja dengan tipe data primitif dan objek dalam pemanggilan metode.

Constructors:
Constructors are special methods within a class used to initialize objects. They share the same name as the class and can be used to set initial values for object attributes. In the example provided:

Default Constructor: Person() initializes a Person object with default values.
Parameterized Constructor: Person(String name, int age) initializes a Person object with specific values for name and age.
Overloading:
Overloading occurs when multiple methods within the same class share the same name but have different parameters or argument lists. In the example:

The Calculator class has two add methods that perform addition, one for two integers and another for three integers, demonstrating method overloading based on the number of parameters.
Overriding:
Overriding happens when a subclass provides a specific implementation for a method that is already defined in its superclass. In the example:

The Animal class has a method makeSound(), which is overridden in the Dog subclass to provide a different sound.
Call by Value and Call by Reference:
Java uses call by value for passing arguments to methods.

Call by Value: For primitive types, a copy of the value is passed. In the example, modifying the primitive int variable (x) inside a method (modifyPrimitive) doesn't affect the original variable.

Call by Reference (or Call by Sharing): For objects, the reference to the object's memory location is passed by value. Changes made to the object's properties via this reference inside a method are reflected in the original object. In the example, modifications to the MyClass object's attribute (obj.value) inside the modifyObject method are visible outside the method because the object is passed by its reference.

These concepts are foundational in Java programming. Constructors are used for object initialization, overloading provides method flexibility, and overriding facilitates polymorphism and method customization in inheritance. Additionally, understanding call by value and call by reference is crucial when working with primitive types and objects, respectively, in method invocations.

# constructors-in-java
# constructors-in-java
# constructors-in-java
