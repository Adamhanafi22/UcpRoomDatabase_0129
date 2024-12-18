package com.example.ucp2.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ucp2.Entity.MataKuliah
import kotlinx.coroutines.flow.Flow

@Dao
interface MatkulDao {
    @Insert
    suspend fun insertMataKuliah(mataKuliah: MataKuliah)

    @Query("SELECT * FROM matkul ORDER BY nama ASC")
    fun getAllMataKuliah() : Flow<List<MataKuliah>>

    @Query("SELECT * FROM matkul WHERE kode = :kode")
    fun getMataKuliah(kode: String ) : Flow<MataKuliah>

    @Delete
    suspend fun deletedMataKuliah(mataKuliah: MataKuliah)

    @Update
    suspend fun updateMataKuliah (mataKuliah: MataKuliah)
}