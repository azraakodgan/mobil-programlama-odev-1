fun faktoriyel(n: Int): Int {

    /*7 değerinin faktoriyelini bulan kotlin kodunu fonksiyon kullanarak yazınız*/

    var sonuc = 1
    for (i in 1..n) {
        sonuc *= i
    }
    return sonuc
}

fun soruUc() {
    val n = 7
    val faktoriyelSonucu = faktoriyel(n)
    println("$n sayısının faktöriyeli = $faktoriyelSonucu")
}
