package com.example.myrecyclerview;

import java.util.ArrayList;

public class DataGunung {

    private static String[] gunungNames = {
            "Gunung Annapurna",
            "Gunung Choyu",
            "Gunung Dhaulagri",
            "Gunung Everest",
            "Gunung K2",
            "Gunung Kangchenjunga",
            "Gunung Kilauea",
            "Gunung Lhotse",
            "Gunung Makalu",
            "Gunung Manaslu",
            "Gunung Nanga Parbat"
    };

    private static String[] gunungDetails = {
            "Annapurna adalah salah satu gunung tertinggi didunia yang berada di Pegunungan Himalaya. Gunung ini memiliki delapan buah puncak, yang tertinggi adalah satu di antara tiga puncak yang dimiliki Annapurna I. Annapurna I memiliki tiga puncak yang disebut dengan: Puncak utama Annapurna I tinggi 8.091 mdpl",
            "Cho Oyu adalah gunung tertinggi keenam di dunia dengan ketinggian 8188 meter di atas permukaan laut. Dalam rumpun bahasa Tibet Cho Oyu berarti \"Dewi Pirus\". Gunung ini adalah puncak utama paling barat dari subbagian Khumbu di Mahalangur Himalaya, 20 km sebelah barat Gunung Everest.",
            "Massa Dhaulagiri di Nepal memanjang 120 km dari Sungai Kaligandaki di barat ke Bheri. Massif ini dibatasi di utara dan barat daya oleh anak-anak sungai Bheri dan di tenggara oleh Myagdi Khola.",
            "Gunung Everest adalah gunung tertinggi di dunia. Rabung puncaknya menandakan perbatasan antara Nepal dan Tibet; puncaknya berada di Tibet. Di Nepal, gunung ini disebut Sagarmatha dan dalam bahasa Tibet Chomolangma atau Qomolangma, dilafalkan dalam bahasa Tionghoa 珠穆朗瑪峰.",
            "K2 adalah gunung tertinggi ke-2 di dunia. Terletak di perbatasan antara Pakistan dan Republik Rakyat Tiongkok di wilayah Gilgit–Baltistan di utara Pakistan, dan di wilayah otonomi Tajik Taskhurgan di Xinjiang, Tiongkok. Tinggi Gunung ini mencapai 8,611 meter.",
            "Kangchenjunga SewaLungma adalah gunung tertinggi ke-3 di dunia setelah Gunung Everest dan Chogori dengan ketinggian 8.586 meter. Gunung ini juga adalah gunung tertinggi ke-2 di Nepal. Kangchenjunga berarti \"Lima Harta Karun Salju, karena ia terdiri dari 5 puncak, empat diantaranya mencapai lebih dari 8.450 meter.",
            "Kīlauea adalah gunung berapi perisai aktif di Kepulauan Hawaii, dan yang paling aktif dari lima gunung berapi yang bersama-sama membentuk pulau Hawaiʻi. Terletak di sepanjang pantai selatan pulau, gunung berapi berusia antara 210.000 dan 280.000 tahun dan muncul di atas permukaan laut sekitar 100.000 tahun yang lalu.",
            "Lhotse merupakan sebuah gunung di Nepal dan RRC. Gunung ini terletak di bagian utara di negara itu. Gunung ini memiliki ketinggian 8.516 m dan merupakan gunung terbesar keempat di dunia dan merupakan salah satu puncak yang membentuk kelompok dari Gunung Everest.",
            "Makalu adalah gunung tertinggi kelima di dunia dengan ketinggian 8485 m. Gunung ini terletak 19 km tenggara Mount Everest, di perbatasan antara Nepal dan Tiongkok. Ia termasuk salah satu dari 14 gunung yang termasuk kategori delapan ribuan. Makalu adalah puncak terisolasi yang bentuknya piramida empat sisi.",
            "Manaslu adalah gunung tertinggi ke-8 di dunia, terletak di Mansiri Himal, bagian dari pegunungan Himalaya, Nepal. Kata Manaslu berasal dari kata bahasa Sanskerta, Manasa dan diterjemahkan sebagai \"Gunung Jiwa\"",
            "Nanga Parbat merupakan sebuah gunung di Pakistan. Gunung ini terletak di bagian utara di negara itu. Gunung ini memiliki ketinggian 8.126 m dan merupakan gunung terbesar kesembilan di dunia. Dalam tingkat kesulitan, medan gunung Nanga Parbat disebut sama beratnya dengan K2"
    };


    private static int[] gunungImages = {
            R.drawable.gunung_annapurna,
            R.drawable.gunung_choyu,
            R.drawable.gunung_everest,
            R.drawable.gunung_k2,
            R.drawable.gunung_kangchenjunga,
            R.drawable.gunung_kilauea,
            R.drawable.gunung_lhotse,
            R.drawable.gunung_makalu,
            R.drawable.gunung_manaslu,
            R.drawable.gunung_nangaparbat
    };

    static ArrayList<Gunung> getListData() {
        ArrayList<Gunung> list = new ArrayList<>();
        for (int position = 0; position < gunungNames.length; position++) {
            Gunung gunung = new Gunung();
            gunung.setNama(gunungNames[position]);
            gunung.setDetil(gunungDetails[position]);
            gunung.setGambar(gunungImages[position]);
            list.add(gunung);
        }
        return list;
    }
}

}
