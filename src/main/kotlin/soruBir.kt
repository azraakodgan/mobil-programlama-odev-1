fun soruBir() {

    //1 den 350 ye kadar olan tek sayıların toplamı ve çarpımı , çift sayıların ise karelerinin toplamını bulan
    //programın kotlin kodunu yazınız

    var tekToplam = 0
    var tekCarpim = 1
    var ciftToplam = 0

    for (i in 1..350) {
        if (i % 2 == 0) {
            ciftToplam += i * i
        } else {
            tekToplam += i
            tekCarpim *= i
        }
    }

    println("1'den 350'ye kadar olan tek sayıların toplamı: $tekToplam")
    println("1'den 350'ye kadar olan tek sayıların çarpımı: $tekCarpim")
    println("1'den 350'ye kadar olan çift sayıların karelerinin toplamı: $ciftToplam")
}
