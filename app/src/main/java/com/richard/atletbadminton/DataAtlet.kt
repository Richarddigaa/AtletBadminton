package com.richard.atletbadminton

object DataAtlet {

    private val namaAtlet = arrayOf(
        "Anthony Ginting",
        "Jonathan Christie",
        "Kevin Sanjaya",
        "Marcus Gideon",
        "Fajar Alvian",
        "Rian Ardianto",
        "Mohammad Ahsan",
        "Hendra Setiawan",
        "Apriyani Rahayu",
        "Greysia Poli"
    )

    private val detailAtlet = arrayOf(
        "Anthony Sinisuka Ginting adalah seorang atlet bulu tangkis tunggal putra, yang berasal dari klub SGS PLN Bandung, Indonesia. Ia memulai karier sebagai pemain bulu tangkis prestasi semenjak duduk di bangku SD dan pernah memenangi kompetisi MILO School Competition kategori tunggal putra SD pada tahun 2008.",
        "Jonatan Christie adalah pemain bulu tangkis tunggal putra Indonesia. Dia berasal dari PB. Tangkas Specs, Jakarta.",
        "Kevin Sanjaya Sukamuljo adalah salah satu pemain bulu tangkis ganda putra dan campuran Indonesia. Atlet ini merupakan pemain asal klub Djarum di Kudus, Jawa Tengah dan bergabung sejak tahun 2007.",
        "Marcus Fernaldi Gideon adalah salah satu pemain bulu tangkis ganda putra Indonesia yang dulu pernah berpasangan dengan Markis Kido di ganda putra dan ganda campuran bersama Rizki Amelia Pradipta. Pada tahun 2015, ia mulai berpasangan dengan Kevin Sanjaya Sukamuljo di ganda putra sampai sekarang.",
        "Fajar Alfian adalah pemain bulu tangkis putra Indonesia spesialis ganda putra. Ia berasal dari PB SGS PLN, Bandung, yang kemudian masuk ke pusat pelatihan nasional PBSI sejak 2014. Fajar merupakan peraih medali perak ganda putra Asian Games 2018 bersama pasangannya, Muhammad Rian Ardianto.",
        "Muhammad Rian Ardianto adalah pemain bulu tangkis Indonesia. Ardianto bermain untuk klub Jaya Raya Jakarta dalam kejuaraan nasional. Dalam kejuaraan junior, dia telah mengumpulkan dua perak, satu perunggu di Kejuaraan Dunia Junior, dan juga sebuah perunggu di Kejuaraan Asia Junior.",
        "Mohammad Ahsan adalah salah satu pemain bulu tangkis ganda putra Indonesia yang biasa berpasangan dengan Hendra Setiawan. Dalam rangking dunia, ia dan Hendra berada di peringkat ke-2 pemain bulu tangkis kelas ganda putra terbaik dibawah pasangan Kevin dan Gideon.  ",
        "Hendra Setiawan mengawali kariernya berpasangan dengan Markis Kido dan pernah menduduki peringkat ke-2 dunia IBF untuk ganda putra. Gelar yang pernah didapat adalah juara dunia 2007 di Malaysia, juara China Super Series 2007 dan Hongkong Super Series 2007. Pada tahun 2008 juga menjadi pasangan Kido/Setiawan juara di Malaysia Super Series.",
        "Apriyani Rahayu adalah pebulutangkis Indonesia spesialis ganda putri dan ganda campuran ketika junior. Di level senior, dia menjadi pebulutangkis spesialis ganda putri. Ia merupakan peraih medali perunggu ganda putri Kejuaraan Dunia 2018 di Tiongkok serta Asian Games 2018 di Jakarta.",
        "Greysia Polii atau sering dipanggil dengan nama Greys adalah salah satu atlet bulu tangkis ganda Indonesia pada nomor ganda putri. Atlet berdarah Minahasa ini adalah putri dari pasangan Willy Polii dan Evie Pakasi. Ia mulai bergabung di tim Piala Uber Indonesia sejak tahun 2004 dan juga tahun 2008."
    )

    private val kelahiranAtlet = arrayOf(
        "20 Oktober 1996 (usia 25 tahun), Cimahi",
        "15 September 1997 (usia 24 tahun)",
        "2 Agustus 1995 (usia 26 tahun), Banyuwang",
        "9 Maret 1991 (usia 30 tahun), Jakarta",
        "7 Maret 1995 (usia 26 tahun), Bandung",
        "13 Februari 1996 (usia 25 tahun), Bantul",
        "7 September 1987 (umur 34), Palembang",
        "25 Agustus 1984 (umur 37), Pemalang",
        "29 April 1998 (usia 23 tahun), Kabupaten Konawe",
        "11 Agustus 1987 (usia 34 tahun), Jakarta"
    )

    private val tinggiAtlet = arrayOf(
        "171 cm", "179 cm", "170 cm", "168 cm", "175 cm", "172 cm", "173 cm", "181 cm", "163 cm", "160 cm"
    )

    private val beratAtlet = arrayOf(
        "64 kg (141 lb)",
        "75 kg (165 pon) (165 pon)",
        "55 kg (121 pon) (121 pon)",
        "70 kg (150 pon) (150 pon)",
        "68 kg (150 pon) (150 pon)",
        "58 kg (128 pon) (128 pon)",
        "68 kg (150 pon)",
        "72 kg (158 lb)",
        "64 kg (141 pon) (141 pon)",
        "57 kg (126 pon)"
    )

    private val potoAtlet = intArrayOf(
        R.drawable.ginting,
        R.drawable.jonathan,
        R.drawable.kevin,
        R.drawable.marcus,
        R.drawable.fajar,
        R.drawable.rian,
        R.drawable.ahsan,
        R.drawable.hendra,
        R.drawable.apriyani,
        R.drawable.greysia
    )

    val lisData : ArrayList<AtletModel>
        get() {
            val list = arrayListOf<AtletModel>()
            for (position in namaAtlet.indices){
                val atlet = AtletModel()
                atlet.nama = namaAtlet[position]
                atlet.detail = detailAtlet[position]
                atlet.poto = potoAtlet[position]
                atlet.kelahiran = kelahiranAtlet[position]
                atlet.tinggi = tinggiAtlet[position]
                atlet.berat = beratAtlet[position]
                list.add(atlet)
            }
            return list
        }
}