package com.example.ucp2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ucp2.Entity.Dosen
import com.example.ucp2.Entity.MataKuliah
import com.example.ucp2.dao.DosenDao
import com.example.ucp2.dao.MatkulDao


@Database(entities = [Dosen::class],[MataKuliah::class], version = 1, exportSchema = false)
abstract class KrsDataBase : RoomDatabase() {

    abstract fun DosenDao(): DosenDao
    abstract fun MatkulDao(): MatkulDao

    companion object {
        @Volatile  // Memastikan bahwa nilai variabel instance selalu sama
        private var Instance: KrsDataBase? = null

        fun getDatabase(context: Context): KrsDataBase {
            return (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDataBase::class.java,  // Class database
                    "KrsDatabase"  // Nama Database
                )
                    .build().also { Instance = it }
            })

        }
    }
}