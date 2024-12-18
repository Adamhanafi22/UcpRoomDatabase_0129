package com.example.ucp2.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Matkul")
data class MataKuliah(
    @PrimaryKey
    val Kode : String,
    val Nama : String,
    val Sks : String,
    val Jenis : String,
    val DosenPengampuh : String,
)
