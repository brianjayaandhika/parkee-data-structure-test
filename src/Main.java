
public class Main {
    public static void main(String[] args) {
        // Jawaban Pertanyaan di line 36 ~ 56

        Node head = new Node(15);
        SingleLinkedList singleLinkedList = new SingleLinkedList(head);

        singleLinkedList.insertAtEnd(25);
        singleLinkedList.insertAtEnd(35);

        singleLinkedList.insertAtBeginning(5);
        singleLinkedList.insertAtEnd(45);



        singleLinkedList.insertAtBeginning(1);
        singleLinkedList.deleteByValue(45);
        singleLinkedList.display();

        // Output
        //1
        //->
        //5
        //->
        //15
        //->
        //25
        //->
        //35
        //->
    }


    // Pertanyaan:
    // 1. Bagaimana memori untuk list dialokasikan dan dikelola dalam metode createList?
    // 2. Apa yang akan terjadi pada memori yang dialokasikan untuk list setelah metode
    //    createList selesai dieksekusi?
    // 3. Apakah ada potensi kebocoran memori dalam kode di atas? Jelaskan jawaban Anda.

    // Jawaban
    // 1. Saya kurang tau createList disini mengacu pada apa, tapi saya akan asumsikan, createList adalah sebuah metode yang akan me-return sebuah List.
    // Maka, variabel tempat menyimpan hasil dari method tersebut, akan disimpan di dalam MEMORY STACK, kemudian, untuk list yang merupakan hasil dari
    // method tersebut, akan disimpan di dalam MEMORY HEAP. Untuk variabel dan object yang dibuat di dalam method createList, akan disimpan di dalam suatu
    // memory frame stack baru, yang akan dibebaskan kembali setelah method itu selesai dipanggil.

    // 2. Yang akan terjadi pada memori yang dialokasikan untuk list setelah metode createList selesai dieksekusi, untuk variabel dan object yang
    // dideklarasikan dan berada di scope local method tersebut, maka akan dibebaskan memorinya oleh Garbage Collector apabila memang sudah tidak
    // bisa dijangkau atau tidak lagi dipakai. Namun untuk variabel yang menampung hasil dan hasil dari method itu sendiri, akan tetap disimpan di memori.

    // 3. Menurut saya tidak ada, karena, semua proses kalkulasi, looping, pembuatan hashmap, peng-inputan data ke dalam hashmap, semua dilakukan di dalam
    // method PairSum, yang hanya akan me-return value yang di deklarasikan di dalam method tersebut, sehingga, apabila memang, hashmap di dalam method
    // merupakan siklik referens, hal tersebut juga tidak akan menyebabkan memory leak, karena setelah method selesai dipanggil dan memberikan hasil,
    // maka memori variabel dan object yang ada di dalam method tersebut akan dibebaskan oleh Garbage Collector. Jadi untuk contoh kode di atas, yang akan tersimpan
    // di memori hanyalah variabel A dan k di dalam memori stack.
}
