package com.richard.atletbadminton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAMA = "name"
        const val EXTRA_DETAIL = "detail"
        const val EXTRA_IMG = "poto"
        const val EXTRA_KELAHIRAN = "kelahiran"
        const val EXTRA_TINGGI = "tinggi"
        const val EXTRA_BERAT = "berat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tv_nama = findViewById<TextView>(R.id.tv_nama)
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        val iv_poto = findViewById<ImageView>(R.id.img_photo)
        val tv_kelahiran = findViewById<TextView>(R.id.tv_Kelahiran)
        val tv_tinggi = findViewById<TextView>(R.id.tv_Tinggi)
        val tv_berat = findViewById<TextView>(R.id.tv_Berat)
        val btn_share = findViewById<Button>(R.id.btn_Share)

        val nama = intent.getStringExtra(EXTRA_NAMA)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val poto = intent.getIntExtra(EXTRA_IMG, 0)
        val kelahiran = intent.getStringExtra(EXTRA_KELAHIRAN)
        val tinggi = intent.getStringExtra(EXTRA_TINGGI)
        val berat = intent.getStringExtra(EXTRA_BERAT)

        supportActionBar!!.title = nama
        tv_nama.text = nama
        tv_detail.text = detail
        tv_kelahiran.text = kelahiran
        tv_tinggi.text = tinggi
        tv_berat.text = berat

        Glide.with(this).load(poto)
            .apply(RequestOptions().override(350,350))
            .into(iv_poto)

        btn_share.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "Haii periksa Aplikasi Keren ini:")
            intent.type = "text/plain"
            startActivity((Intent.createChooser(intent, "Share TO : ")))
        }
    }
}