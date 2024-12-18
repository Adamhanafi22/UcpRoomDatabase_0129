package com.example.ucp2.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Dosen")
data class Dosen(
    @PrimaryKey
    val Nidn : String,
    val Nama : String,
    val JenisKelamin : String,

)
