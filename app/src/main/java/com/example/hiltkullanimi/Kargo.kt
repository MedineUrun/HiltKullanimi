package com.example.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor(var adres: Adres) { //Tüketici - Consumer

    fun gonder(){
        Log.e("Sonuc", "Kargo ${adres.bilgi} adresine gönderildi.")
    }
}