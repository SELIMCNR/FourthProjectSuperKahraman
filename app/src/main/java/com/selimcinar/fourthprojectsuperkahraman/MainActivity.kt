package com.selimcinar.fourthprojectsuperkahraman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  private  var numara = 0   //scope kapsam class içerisinde her yerden ulaşılabilir.
  private  var isim = ""
  private  var yas : Int? = null
  private  var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numara=10 // oncreate ilk çalışma durumu kapsamında
    }
        fun superKahramanyap (view:View){
                numara = 15 // fonksiyon kapsamında
             isim = isimText.text.toString()  // isimText id'sinden gelen değeri Stringe çevir isim değişkenine ata
             yas = yasText.text.toString().toIntOrNull()//  yasText id'sinden gelen değeri yas değişkenine  ata atarken ınte cevir cevriremezsen Null değerini ver
             meslek = meslekText2.text.toString()

            if (yas == null){   //Yas değişkeni nullsa bunu yaz
                sonucText.text = "Doğru yaşı giriniz"
            }
            else{               //yas değişkeni null değilse bunu yaz
                val SuperKahraman = superKahraman(isim,yas!!,meslek)
                sonucText.text = "İsim : ${isim} Yaş: ${yas} Meslek: ${meslek}"
            }
        }
    }
