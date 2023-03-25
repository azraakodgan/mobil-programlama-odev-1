fun mukemmelSayi() {

    /*Ekrandan girilen sayının mükemmel sayı olup olmadığını bulan programın kotlin kodunu yazınız.
    (Mükemmel sayı, kendisini tam bölen sayıların toplamı, kendine eşit olan sayılardır.
    Örnek 28’dir. 1+2+4+7+14 = 28)*/

    print("Bir sayı giriniz: ")
    val sayi = readLine()!!.toInt()
    var toplam = 0

    for (i in 1 until sayi) {
        if (sayi % i == 0) {
            toplam += i
        }
    }

    if (toplam == sayi) {
        println("$sayi  mükemmel sayı.")
    } else {
        println("$sayi  mükemmel sayı değil.")
    }
}
