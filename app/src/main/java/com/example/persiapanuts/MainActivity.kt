package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.golkar,"20 Oktober 1964","Golkar","Ketua umum : Airlangga Hartanto\n" +
                "Sekretaris jenderal : Lodewijk Freidrich Paulus"))

        data?.add(DataModel(R.drawable.pan,"23 Agustus 1998","PAN", "Ketua umum : Zulkifli Hasan\n" +
                "Sekretaris jenderal : Eddy Suparno"))

        data?.add(DataModel(R.drawable.perindo,"7 Februari 2015","Perindo", "Ketua umum : Hary Tanoesoedibjo\n" +
                "Sekretaris jenderal : Ahmad Rofiq"))

        data?.add(DataModel(R.drawable.pkb,"23 Juli 1998","PKB", "Ketua umum : Muhaimin Iskandar\n" +
                "Sekretaris jenderal : Abdul Kadir Karding"))

        data?.add(DataModel(R.drawable.pks,"20 April 2002","PKS", "Ketua umum : Mohamad Sohibul Iman\n" +
                "Sekretaris jenderal : Mustafa Kamal"))

        data?.add(DataModel(R.drawable.ppp,"5 Januari 1973","PPP", "Ketua umum : Muhammad Romahurmuziy\n" +
                "Sekretaris jenderal : Arsul Sani"))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.dibentuk)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}